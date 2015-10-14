package us.shairyar.deiteljava.ch6;

import java.util.Scanner;

/**
 * Created by shairyarshafqat on 11/9/14.
 */
public class SquareOfAsterisks {

    // Write a method squareOfAsterisks that displays a solid square (the same number of rows and columns)
    // of asterisks whose side is specified in integer parameter side.

    //For example, if side is 4, the method should display
    /*  ****
        ****
        ****
        ****  */

    // Incorporate this method into an application that reads an integer value for side from the user and outputs
    // the asterisks with the squareOfAsterisks method.

    public static void squareOfAst(int sides)
    {
        for(int i = 0; i < sides; i++)
        {
            for (int j = 0; j <= sides; j++)
                System.out.print('*');

            System.out.println();
        }

    }

    public static void main(String[] args) {

        squareOfAst(10);
    }



}
