package us.shairyar.deiteljava.ch6;

import java.util.Scanner;

import static java.lang.Math.floor;

/**
 * Created by shairyarshafqat on 11/6/14.
 */
public class RoundingNumbers2 {

    public static void roundingNum()
    {
        Scanner input = new Scanner(System.in);

        // Write an application that reads double values
        System.out.print("Enter a double value: ");
        double value = input.nextDouble();
        System.out.println();

        // will round the number value to the nearest integer and assign the result to y.
        double integer = floor(value + 0.5);
        double tenths = floor( value * 10 + 0.5 ) / 10;
        double hundredths = floor( value * 100 + 0.5 ) / 100;
        double thousandths = floor(value * 1000 + 0.5) / 1000;

        // to round each of the numbers to the nearest integer.
        int integerValue = (int)integer;

        // For each number processed, display both the original number and the rounded number.
        System.out.println("Original value " + value);
        System.out.println("Rounded value " + integerValue);
        System.out.println("Tenth value " + tenths);
        System.out.println("Hundredths value " + hundredths);
        System.out.println("Thousandths value " + thousandths);

    }

    public static void main(String[] args) {

        RoundingNumbers2.roundingNum();
    }
}
