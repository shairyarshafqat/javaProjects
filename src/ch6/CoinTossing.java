package us.shairyar.deiteljava.ch6;

import java.util.*;

/**
 * Created by shairyarshafqat on 11/19/14.
 */
public class CoinTossing {

    // Write an application that simulates coin tossing.
    // Let the program toss a coin each time the user chooses the “Toss Coin” menu option.
    // Count the number of times each side of the coin appears. Display the results.
    // The program should call a separate method flip that takes no arguments and returns a value from a Coin enum (HEADS and TAILS).
    // [Note: If the program realistically simulates coin tossing, each side of the coin should appear approximately half the time.]

    private Random randomNumbers = new Random();
    private enum Toss {Heads,Tails}


    static void TossCoin()
    {
        Scanner input = new Scanner(System.in);

        String y = null;

        System.out.println("Welcome to coin tossing simulation");

        System.out.print("Enter 'y' to flip the coin: ");
        y = input.nextLine();







    }

    public static void main(String[] args) {

        TossCoin();
    }
}
