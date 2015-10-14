package us.shairyar.deiteljava.ch6;

import java.util.Scanner;

/**
 * Created by shairyarshafqat on 11/9/14.
 */
public class Even {

    // Write a method isEven that uses the remainder operator (%) to determine whether an integer is even.
    // The method should take an integer argument and return true if the integer is even and false otherwise.
    // Incorporate this method into an application that inputs a sequence of integers (one at a time) and determines
    // whether each is even or odd.

    public static void isEven()
    {
        int x;
        boolean done = false;


        Scanner input = new Scanner(System.in);

        while (!done)
        {
            System.out.print("Enter an integer(enter '-1' to break): ");
            System.out.println();
            x = input.nextInt();

            if (x == -1)
                break;

            if(x % 2 == 0)
            {
                System.out.println("Number is even!!");
            }

            else
            {
                System.out.println("Number is odd!!");
            }

        }

    }

    public static void main(String[] args) {

        isEven();
    }
}
