package us.shairyar.deiteljava.ch6;

import java.util.Random;

/**
 * Created by shairyarshafqat on 11/4/14.
 */
public class RandomPractice {

    public static void main(String[] args) {

        for(int i = 1; i <= 20;i++)
        {
            Random random = new Random();

            int face;

            face = 1 + random.nextInt(6);

            System.out.printf("%d       ", face);

            if(i % 5 == 0)
                System.out.println();

//            System.out.printf("%d   ",face);

        }


    }

}
