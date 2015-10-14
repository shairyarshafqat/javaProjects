package us.shairyar.deiteljava.ch6;

/**
 * Created by shairyarshafqat on 11/8/14.
 */
import java.util.Scanner;

public class MultiplesCh6 {

    // Write a method isMultiple that determines, for a pair of integers, whether the second integer is a multiple of the first.
    // The method should take two integer arguments and return true if the second is a multiple of the first and false otherwise.
    // Hint: Use the remainder operator.
    // Incorporate this method into an application that inputs a series of pairs of integers (one pair at a time)
    // and determines whether the second value in each pair is a multiple of the first.

    public static void isMultiple()
    {
        Scanner input = new Scanner(System.in);

        boolean done = false;
        int x = 0;
        int y = 0;

        while(!done)
        {

            System.out.print("Enter first integer(Enter '-1' to exit the loop): ");
            x = input.nextInt();

            if(x == -1)
                break;

            System.out.print("Enter second integer: ");
            System.out.println();
            y = input.nextInt();

            int divisible = x % y;

            if (divisible == 0)
            {
                System.out.println("the number are divisible");
                System.out.println();
            }
            else
            {
                System.out.println("they aren't divisible");
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {

        isMultiple();

    }


}
