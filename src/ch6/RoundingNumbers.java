package us.shairyar.deiteljava.ch6;

/**
 * Created by shairyarshafqat on 11/6/14.
 */

import static java.lang.Math.floor;

import java.util.Scanner;

public class RoundingNumbers {

    // Math.floor can be used to round values to the nearest integer
    // y = Math.floor( x + 0.5 );


    public static void RoundingNum()
    {
        Scanner input = new Scanner(System.in);

        // Write an application that reads double values
        System.out.print("Enter a double value: ");
        double x = input.nextDouble();
        System.out.println();

        // will round the number x to the nearest integer and assign the result to y.
        double y = floor(x + 0.5);

        // to round each of the numbers to the nearest integer.
        int z = (int)y;

        // For each number processed, display both the original number and the rounded number.
        System.out.printf("Original Value\tRounded value\n%f\t\t%d", x, z);
    }


    public static void main(String[] args) {

        RoundingNumbers.RoundingNum();
    }
}
