package us.shairyar.deiteljava.ch6;

import java.util.Random;

/**
 * Created by shairyarshafqat on 11/10/14.
 */
public class RandomNumbers {

    // Write statements that will display a random number from each of the following sets:
    // a) 2,4,6,8,10.
    // b) 3,5,7,9,11.
    // c) 6, 10, 14, 18, 22.

    public static void rNumber()
    {
        Random r = new Random();

        int face;

        for(int counter = 1; counter <= 5; counter++)
        {
            face = 1 + r.nextInt(10);

            if(face % 2 == 0)
                System.out.printf("%d  ", face);
        }

        System.out.println();

        for(int counter = 1; counter <= 5; counter++)
        {
            face = 1 + r.nextInt(10);

            if(face % 2 != 0)
                System.out.printf("%d  ", face);
        }

        System.out.println();

        for(int counter = 1; counter <= 5; counter++)
        {
            face = 6 + r.nextInt(22);

            if(face % 2 != 0)
                System.out.printf("%d  ", face);
        }
    }

    public static void main(String[] args) {

        rNumber();

    }
}
