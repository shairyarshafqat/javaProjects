package us.shairyar.deiteljava.ch5;

import java.util.Scanner;

/**
 * Created by shairyarshafqat on 10/26/14.
 */
public class PythagoreanTriples {

//    The set of three integer values for the lengths of the sides of a right triangle is called a Pythagorean triple.
//    The lengths of the three sides must satisfy the relationship that the sum of the
//    squares of two of the sides is equal to the square of the hypotenuse.


    public static void pythagorean(int number) {

        if (number > 0)
            for (int a = 1; a <= number - 2; a++) {
                for (int b = a + 1; b <= number - 1; b++) {
                    for (int c = b + 1; c <= number; c++) {
                        if (a * a + b * b == c * c) {
                            System.out.println(a + " " + b + " " + c);

                        }
                    }
                }
            }

        else {
            System.out.println("Wrong number!!!");
        }
    }






    public static void main(String[] args)
    {


//      Write an application that displays a table of the Pythagorean triples for side1,
//      side2 and the hypotenuse, all no larger than 500

        Scanner input = new Scanner(System.in);

        int number = 0;


            System.out.println("Enter Number: ");
            number = input.nextInt();

        if(number < 500){
            pythagorean(number);
        }

        else
            System.out.println("Number is greater than 500");










//         Math.pow(c,2) = Math.pow(a,2) + Math.pow(b,2);
//            System.out.printf("%,d%,d%,d", a, b, c);
    }
}


