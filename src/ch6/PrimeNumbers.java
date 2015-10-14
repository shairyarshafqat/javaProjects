package us.shairyar.deiteljava.ch6;

/**
 * Created by shairyarshafqat on 11/15/14.
 */
public class PrimeNumbers {

    // A positive integer is prime if it’s divisible by only 1 and itself.
    // For example, 2, 3, 5 and 7 are prime, but 4, 6, 8 and 9 are not.
    // The number 1, by definition, is not prime.

    // a) Write a method that determines whether a number is prime.

    // b) Use this method in an application that determines and displays all the prime numbers
    //    less than 10,000. How many numbers up to 10,000 do you have to test to ensure that
    //    you’ve found all the primes?

    // c) Initially, you might think that n/2 is the upper limit for which you must test to see
    //    whether a number n is prime, but you need only go as high as the square root of n.
    //    Rewrite the program, and run it both ways.

    public static void pNum(int n)
    {
        int t = 0;

        for(int i = 2; i <= n; i++)
        {
            if(n % 2 == 0) {
                t += n;
            }
        }

        if(t == 0)
            System.out.println(n +" It's a prime number.");

        else
            System.out.println(n + " It's not a prime number.");

    }

    public static void main(String[] args) {

        pNum(17);
        pNum(1777);
        pNum(2887);
        pNum(22888);
    }
}
