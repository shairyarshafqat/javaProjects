package us.shairyar.deiteljava.ch6;

/**
 * Created by shairyarshafqat on 11/6/14.
 */
import java.lang.*;

public class Exponentiation {

    // Write a method integerPower(base, exponent) that returns the value of base exponent
    // For example, integerPower(3, 4) calculates 3^4 (or 3 * 3 * 3 * 3).
    // Assume that exponent is a positive, nonzero integer and that base is an integer.
    // Use a for or while statement to control the calculation.
    // Do not use any Math class methods.
    // Incorporate this method into an application that reads integer values for base and exponent and performs the calculation with the integerPower method.

    public static void integerPower(int base, int expo)
    {
        int z = (int) java.lang.Math.pow(base, expo);

        System.out.println(z);
    }

    public static void main(String[] args) {

        Exponentiation.integerPower(8,4);
    }
}
