package us.shairyar.deiteljava.ch6;

import java.lang.*;
import java.lang.Math;

/**
 * Created by shairyarshafqat on 11/14/14.
 */
public class PerfectNumbers {

    // An integer number is said to be a perfect number if its factors, including 1 (but not the number itself), sum to the number.
    // For example, 6 is a perfect number, because 6 = 1 + 2 + 3.
    // Write a method isPerfect that determines if parameter number is a perfect number.
    // Use this method in an application that displays all the perfect numbers between 1 and 1000.
    // Display the factors of each perfect number to confirm that the number is indeed perfect.
    // Challenge the computing power of your computer by testing numbers much larger than 1000.
    // Display the results.

//    public boolean isPerfectNumber(int number){
//
//    int temp = 0;
//    for(int i=1;i<=number/2;i++){
//        if(number%i == 0){
//            temp += i;
//        }
//    }
//    if(temp == number){
//        System.out.println("It is a perfect number");
//        return true;
//    } else {
//        System.out.println("It is not a perfect number");
//        return false;
//    }
//}
//
//    public static void main(String a[]){
//        IsPerfectNumber ipn = new IsPerfectNumber();
//        System.out.println("Is perfect number: "+ipn.isPerfectNumber(28));
//    }
//}

    public static void isPerfect(int n)
    {
        int t = 0;

        for(int i = 1; i <= n / 2; i++)
        {
            if(n % i == 0)
                t += i;
        }

        if(t == n)
        {
            System.out.println(n + " Is a perfect number.");
        }

        else{
            System.out.println("Not a perfect number.");
        }
    }









// {
//        for(int i = 1; i <= n; i++)
//        {
//            if (i % 2 == 0)
//            {
//                double a = Math.pow(2, i) * (Math.pow(2, n) - 1);
//                int z = (int) a;
//
//                System.out.println(z);
//            }
//
//            else
//                System.out.println("It's not a perfect number.");
//        }
//    }


    public static void main(String[] args) {

        isPerfect(6);

    }
}
