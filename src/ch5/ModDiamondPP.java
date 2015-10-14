package us.shairyar.deiteljava.ch5;

/**
 * Created by shairyarshafqat on 10/28/14.
 */

import java.util.Scanner;

public class ModDiamondPP {

    public static void main(String[] args) {

        System.out.printf("%s\n","Diamond shaped asterisks");

        Scanner in = new Scanner(System.in);

        for (int i = 1; i < 10; i += 2) {
            for (int j = 0; j < 9 - i / 2; j++)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("*");

            System.out.print("\n");
        }

        for (int i = 7; i > 0; i -= 2) {
            for (int j = 0; j < 9 - i / 2; j++)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("*");

            System.out.print("\n");
        }
    }
}
