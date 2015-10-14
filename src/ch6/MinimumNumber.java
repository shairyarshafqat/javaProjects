package us.shairyar.deiteljava.ch6;


import java.lang.*;

/**
 * Created by shairyarshafqat on 11/14/14.
 */
public class MinimumNumber {

    public static void Min3(double a, double b, double c)
    {
        double o = java.lang.Math.min(java.lang.Math.min(a,b),c);

        System.out.println("The smallest of three floating-point value is "+o);
    }

    public static void main(String[] args) {

        Min3(33.2,30.1,33.7);
    }
}
