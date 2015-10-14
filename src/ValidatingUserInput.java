/**
 * Created by shairyarshafqat on 10/14/14.
 */

import java.util.Scanner;

public class ValidatingUserInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean done = false;
        int number;

        System.out.println("Enter '1' or '2' to exit out of the loop" );

        while(!done)
        {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if(number == 1)
                break;
            else if (number == 2)
                break;

            System.out.println("the number you entered is: " + number);

        }


    }
}
