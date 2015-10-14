package us.shairyar.deiteljava.ch5;

/**
 * Created by shairyarshafqat on 10/26/14.
 */

import java.util.Scanner;

public class ValueOfPie {

    public static void calcPi() {
        // Print a table that shows the value of π approximated by computing the first 200,000 terms of this series.
        // How many terms do you have to use before you first get a value that begins with 3.14159?

//       double pi = 4 - 4/3 + 4/5 + 4/7 + 4/9 + 4/11;
        System.out.printf("%s%20s\n", "Value", "Pi");
        double pi = 4.0;
        int i = 1;

        for (i = 1; i <= 200; i++)
            pi*= pi + i;

            System.out.printf("%d%20f\n", i, pi);

    }


    public static void main(String[] args) {

//        double pi = 4.0;
//        double stat;
//        double sign = -1.0;
//
//
//        System.out.printf("%s%20s\n", "term", "Value of Pi");
//
//        int i;
//
//        for (i = 3; i <= 200000; i+= 2)
//            {
//                stat = 4.0 / i;
//                pi +=  sign * stat;
//                sign = -sign;
//
//                System.out.printf("%4d%20f\n", i + 2, pi);
//            }


       calcPi();

    }


}
