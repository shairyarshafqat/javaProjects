package us.shairyar.deiteljava.Ch20;

/**
 * Created by shairyarshafqat on 3/5/15.
 */

import java.io.*;
import java.util.*;
public class ParseXML {

    // stack for validation
    private Stack<XMLToken> XMLTokenStack;

    // StringBuffer and count for errors
    private StringBuffer errors;
    private int numErrors;

    public static void main(String[] args)
    {
        if (args.length < 1)

            System.out.println("usage: java ParseXML <xml file>");

        else
        {
            for (String fileName : args)
            {
                ParseXML parseXML = new ParseXML();

                try
                {
                    parseXML.validateXML(fileName);
                }

                catch (Exception e)
                {
                    System.out.println(e);
                }
            }
        }
    } // end main

    private void validateXML(String file) throws IOException
    {
        System.out.println("\nParsing " + file + "...\n===========================");

        XMLTokenStack = new Stack<XMLToken>();

        errors = new StringBuffer();

        FileReader fileReader;

        BufferedReader input;

        try
        {
            fileReader = new FileReader(file);
            input = new BufferedReader(fileReader);

            int lineNum = 1;
            int indentation = 0;

            // split by spaces
            char[] parse = {' '};
            String delims = new String(parse);

            // read in first line
            String line = input.readLine();

            // while there's still input
            while (line != null)
            {
                // split the tokens in the line
                String[] lineTokens = line.split(delims);

                // for every token
                for (int i = 0; i < lineTokens.length; i++)
                {
                    // make a new XMLToken
                    XMLToken token = new XMLToken(lineNum, i + 1, indentation, lineTokens[i]);

                    // if token is a closing tag, check if it matches the first opening tag in stack
                    if (token.getType() == 2)
                    {
                        String close = token.getToken();
                        // take out the forward slash to compare with opening tag
                        close = close.replace("/", "");

                        // if equal
                        if (!XMLTokenStack.isEmpty() && XMLTokenStack.peek().getToken().equals(close))
                        {
                            // pop the opening tag out of the stack
                            // if indentation is greater than 0, pull back the indentation
                            if (indentation > 0)
                            {
                                XMLTokenStack.pop();
                                indentation--;
                                token.setIndentation(indentation);
                            }
                        }
                        else // if closing tag does not match opening tag, log the error
                        {
                            if (!XMLTokenStack.isEmpty())
                            {
                                errors.append("Error at Line " + token.getLineNum() + ", index " + token.getIndex() + ": " + token.getToken() + " - expecting: " + XMLTokenStack.peek().getToken() + "\n");
                                numErrors++;
                            }
                            else
                            {
                                errors.append("Error at Line " + token.getLineNum() + ", index " + token.getIndex() + ": " + token.getToken() + " - expecting an opening tag\n");
                                numErrors++;
                            }

                            indentation--;
                            token.setIndentation(indentation);
                        }
                    }
                    // if token is an opening tag
                    else if (token.getType() == 1)
                    {
                        // put in the stack and push forward indentation
                        XMLTokenStack.push(token);
                        indentation++;
                    }

                    // tabs = 4 * token indentation
                    String tabs = "";
                    for (int j = 0; j < token.getIndentation(); j++)
                        tabs += "    ";

                    // if token is an opening or closing tag add a new line first
                    if (token.getType() == 1 || token.getType() == 2)
                        System.out.print("\n" + tabs + token.getToken());
                        // if a token is a string or self-closing tag
                    else
                        System.out.print(token.getToken() + " ");
                }
                // increase the line number and read next line
                lineNum++;
                line = input.readLine();
            }
            input.close();
            fileReader.close();
        }

        catch (Exception e)
        {
            System.out.println(e);
        }
        //for every unmatched opening tag in the stack, log an error
        for (XMLToken t : XMLTokenStack)
        {
            XMLToken token = XMLTokenStack.pop();
            errors.append("Error at Line " + token.getLineNum() + ", index " + token.getIndex() + ": " + token.getToken() + " not closed.\n");
            numErrors++;
        }
        // print out all of the errors
        System.out.println("\n\n======================\n" + numErrors + " errors found.");
        System.out.println(errors);
    }

    // token class
    private class XMLToken
    {
        private String token;
        private int type; // -1 = word, 0 = self-closing, 1 = opening, 2 = closing
        private int lineNum;
        private int index;
        private int indentation;

        public XMLToken(int lineNum, int index, int indentation, String token)
        {
            this.lineNum = lineNum;
            this.index = index;
            this.token = token;
            this.indentation = indentation;
            this.determineTokenType();
        }

        // determine the type of the token
        // -1 = word, 0 = self-closing, 1 = opening, 2 = closing
        private void determineTokenType()
        {
            if (token.startsWith("<") && token.endsWith(">"))
            {
                if (token.charAt(1) == '/')
                    this.type = 2;
                else if ((token.charAt(token.length() - 2)) == '/')
                    this.type = 0;
                else
                    this.type = 1;
            }
            else
                this.type = -1;
        }

        public int getLineNum()
        {
            return this.lineNum;
        }

        public int getIndex()
        {
            return this.index;
        }

        public int getType()
        {
            return this.type;
        }

        public String getToken()
        {
            return this.token;
        }

        public int getIndentation()
        {
            return this.indentation;
        }

        // set this.indentation to indentation if 0 or greater,
        // 0 otherwise
        public void setIndentation(int indentation)
        {
            this.indentation = indentation;
        }
    }

}