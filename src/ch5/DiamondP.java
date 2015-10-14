package us.shairyar.deiteljava.ch5;

/**
 * Created by shairyarshafqat on 10/27/14.
 */
public class DiamondP {

    public static void main(String[] args) {

//    You may use output statements that print a single asterisk (*), a single space or a single new- line character
//    Maximize your use of repetition (with nested for statements), and minimize the number of output statements.


        System.out.printf("%s\n","Diamond shaped asterisks");

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


//        int row, numberOfStars;
//
//        for (row = 1; row <= 9; row++) {
//            for(numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
//                if(numberOfStars % 2 == 0){
//                    System.out.print("*");
//                }
//
//            }
//            System.out.println(); // Go to next line
//        }
    }
}
//
//        String ast = null;
//        int i = 0;
//        int a = 0;
//        int n = 1;
//
//        if(n > 0) {
//            for (i = 1; i <= 11; i++) {
//                if(i % 3 == 0)
//                System.out.printf("%d\n", i);
////                for (a = 1; a <= i + 7; a++) {
////                    System.out.printf("%d\n", a);
////                }
//            }
//        }






