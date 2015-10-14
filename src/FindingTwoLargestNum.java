/**
 * Created by shairyarshafqat on 10/13/14.
 */

import java.util.Scanner;

public class FindingTwoLargestNum {

    public static void main(String[] args) {


        int counter = 1;
        int number;
        int largest1 = 0;
        int largest2 = 0;
        int largest3 = 0;

                Scanner input = new Scanner(System.in);

//                System.out.println("Enter the number: ");
//                number = input.nextInt();

                while(counter <= 5)
                {
                    System.out.println("Enter the number: ");
                    number = input.nextInt();

                    if(number > largest1)
                    {
                        largest2 = largest1;
                        largest1 = number;
                    }

                    else if(number > largest2)
                        largest2 = number;



                    // the number has to be smaller than largest1 but bigger than every other number.




//                    else if(number > largest3)
//                        largest3 = number;

                    // counter needs to be after the if statements
                    counter++;

                }

        System.out.println("the first largest number is " + largest1);

        System.out.println("the second largest number is " + largest2);

//        System.out.println("the second largest number is " + largest3);


    }


}


