package us.shairyar.deiteljava.ch6;

import java.util.Scanner;

/**
 * Created by shairyarshafqat on 11/15/14.
 */
public class ReversingDigits {

    // Write a method that takes an integer value and returns the number with its digits reversed.
    // For example, given the number 7631, the method should return 1367.
    // Incorporate the method into an application that reads a value from the user and displays the result.

    public static void rDigits()

    {
        int n;
        int reverse = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number to reverse: ");
        n = in.nextInt();

        while(n != 0)
        {
            reverse *= 10;
            reverse += n % 10;
            n = n / 10;
        }

        System.out.println("Reverse of entered number is: " + reverse);

    }

    public static void main(String[] args) {

        rDigits();
    }
}
