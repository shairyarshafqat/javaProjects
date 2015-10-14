package Java_Questions.DerekBanasTutorial;

/**
 * Created by shairyarshafqat on 5/14/15.
 */
import java.util.regex.*;

public class RegexTutorial {

    public static void main(String[] args)
    {

        String longString = " Shairyar Shafqat CA AK 12345 PA (412)555-1242 johnsmith@hotmail.com (412)155-1422  411 525-1442 (422)512-1762 ";
        String strangeString = " 1Z aa ***** *** {{{{ {{{ {{  {{ ";


//        // word that is 2-20 characters in length
//        //[A-Za-z] \\w{2,20
//        regexChecker("[A-Za-z]{5,}\\s", longString);
//
//        // Zip code is 5 digits
//        regexChecker("\\s\\d{5}\\s", longString);
//
//        //2 characters that start from C and A
//        //A[LKRZ]|C[AOT]
//        regexChecker("A[LKRZ]|C[AOT]",longString);
//
//        // {5,}
//        // +
//        // . ^ * + ? {} [] \| ()
//        regexChecker("(\\{{1,})", strangeString);
//
//        // grabbing the asterisk
//        regexChecker("(\\*{1,})",strangeString);

        // this is how you find an email id
        // johnsmith@hotmail.com

//        regexChecker("[A-Za-z0-9._-]+@[A-Za-z]+\\.[A-Za-z]{2,}",longString);

        // This is how you find you about the phone number
        // (412)155-1422 (411)525-1442 (422)512-1762

        regexChecker("([0-9]( |-)?)?(\\(?[0-9]{3}\\)?|[0-9]{3})( |-)?([0-9]{3}( |-)?[0-9]{4}|[a-zA-Z0-9]{7})", longString);

        // method to replace the space and make the string comma-seperated.
        regexReplace(longString);
        regexReplace(strangeString);
    }

    // This method checks the 2 string created above and gives the starting and ending of each word.
    public static void regexChecker(String theRegex, String str2Check)
    {
        Pattern checkRegex = Pattern.compile(theRegex);

        Matcher regexMatcher = checkRegex.matcher(str2Check);

        while(regexMatcher.find())
        {
            if(regexMatcher.group().length() != 0)
            {
                System.out.println(regexMatcher.group().trim());
            }

            System.out.println("Start index: " + regexMatcher.start());
            System.out.println("End index: " + regexMatcher.end());
            System.out.println();

        }
    }

    // changes anything in the string.
    // currently changing the space and making it comma-seperated.
    public static void regexReplace(String str2Replace)
    {
//        Pattern replace = Pattern.compile("[A-Za-z]+", Pattern.CASE_INSENSITIVE);

        Pattern replace = Pattern.compile("\\s+");

        Matcher regexMatcher = replace.matcher(str2Replace.trim());

        System.out.println(regexMatcher.replaceAll(", "));
    }

}
