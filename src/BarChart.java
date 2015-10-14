/**
 * Created by shairyarshafqat on 10/20/14.
 */
import java.util.Scanner;

import java.util.StringTokenizer;
public class BarChart {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 1 ;
        int number1 = -1, number2 = -1, number3, number4, number5;

        // Write an application that reads five numbers between 1 and 30
        //

        for(int i = 1; i <= 2; i++)
        {
            System.out.println("Enter an int from 1 through 30: ");
            if (i == 1) {
                number1 = input.nextInt();
            } else if (i == 2) {
                number2 = input.nextInt();
            }

        }



//        String Tokenizer str = new StringTokenizer("input_str");
//
//        while(str.hasMoreTokens())
//        {
//            int int_input = Integer.valueOf(str.nextToken());
//        }
        /*StringTokenizer str = new StringTokenizer(input_str);
            while(str.hasMoreToken()) {int int_input = Integer.valueOf(str.nextToken());*/

        // print the bar graph.

        if (number1 >= 1 && number1 <= 30)
        {
//            System.out.println(number);

            // For example, if your program reads the number 7, it should display *******.
            // Display the bars of asterisks after you read all five numbers.
            for (int i = 0; i < number1; i++)
                System.out.printf("%s", "*");
            System.out.println();
        }
        else
            System.out.println("number too big");

        if (number2 >= 1 && number2 <= 30)
        {
//            System.out.println(number);

            // For example, if your program reads the number 7, it should display *******.
            // Display the bars of asterisks after you read all five numbers.
            for (int i = 0; i < number2; i++)
                System.out.printf("%s", "*");
        }
        else
            System.out.println("number too big");


    }
}
