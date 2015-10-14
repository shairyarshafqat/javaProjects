package us.shairyar.deiteljava.ch7;

import java.util.Scanner;

/**
 * Created by shairyarshafqat on 12/28/14.
 */
public class DuplicateElimination {

    public static void main(String[] args) {

        /*Use a one-dimensional array to solve the following problem:
        Write an application that inputs five numbers, each between 10 and 100, inclusive. As each number is read, display it only if
        it’s not a duplicate of a number already read. Provide for the “worst case,” in which all five numbers are different. Use
        the smallest possible array to solve this problem. Display the complete set of unique values input after the user enters each new value.*/

        Scanner input = new Scanner(System.in);

        // the variable to read the number
        int number = 0;
        boolean found = false;

        // the array with the elements needed to be checked
        int [] array = {12, 33, 54, 90, 100, 1};

        // for loop to ask the question if the number is in the array.
        for(int counter = 0; counter < array.length; counter++ )
        {
            System.out.print("Enter a number to check in between 10 and 100: ");
            number = input.nextInt();
            if(number <= 10 && number >= 100)
            {
                System.out.printf("The number is smaller than or greater than 100, inclusively.");
                break;
            }

            if (number == array[counter])
            {
                found = true;
                System.out.printf("The number %d is in the array\n\n", array[counter]);
            }
            else
                System.out.printf("The number %d is not in the counter.\n\n", number);


        }









    }
}
