package us.shairyar.deiteljava.ch6;

import java.lang.*;

/**
 * Created by shairyarshafqat on 11/15/14.
 */
public class GreatestCommonDivisor {

    //  The greatest common divisor (GCD) of two integers is the largest integer that evenly divides each of the two numbers.
    // Write a method gcd that returns the greatest common divisor of two integers.
    // [Hint: You might want to use Euclid’s algorithm. You can find information about it at en.wikipedia.org/wiki/Euclidean_algorithm.]
    // Incorporate the method into an application that reads two values from the user and displays the result.


    public static int getGcd(int b, int d)
    {
        int gcd = 1;

        if(b>d)
        {
            for(int i = d; i >=1; i--)
                if(b%i==0 && d%i ==0)
                    return i;

        }
        else
            for(int j = b; j >=1; j--)
                if(b%j==0 && d% j==0)
                    return j;

        return gcd;

    }


//        int remainder = 0;
//        int divide = 0;
//        int total = 0;
//
//
//        if (b == 0)
//            return a;
//        else
//            return gcd(b, a % b);



//        for (int i = 1; i <= a; i++) {
//
//            divide = a / b;
//            remainder = a % b;
//
//            total = divide * (b) - remainder;
//
//
//        }

//        System.out.println(total);
//        System.out.println(divide);
//        System.out.println(remainder);


    public static void main(String[] args) {

        System.out.println("the GCD is " +getGcd(7398, 2877));
    }
}
