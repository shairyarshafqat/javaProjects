package us.shairyar.deiteljava.ch6;

/**
 * Created by shairyarshafqat on 11/10/14.
 */
public class SeparatingDigits {

    // Write methods that accomplish each of the following tasks:
    // a) Calculate the integer part of the quotient when integer a is divided by integer b.
    // b) Calculate the integer remainder when integer a is divided by integer b.
    // c) Use the methods developed in parts (a) and (b) to write a method displayDigits that receives an integer between
    // 1 and 99999 and displays it as a sequence of digits, separating each pair of digits by two spaces.

    // For example, the integer 4562 should appear as
    // 4  5  6  2
    // Incorporate the methods into an application that inputs an integer and calls display-
    // Digits by passing the method the integer entered. Display the results.

    public static void displayDigits(int a, int b)
    {
        double d = a / b;
        double r = a % b;

        System.out.println(d);
        System.out.println(r);



    }


    public static void main(String[] args) {

        displayDigits(3,8);

    }
}
