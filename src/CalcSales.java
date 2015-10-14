/**
 * Created by shairyarshafqat on 10/21/14.
 */
import java.util.Scanner;

public class CalcSales {

        public static void main(String[] args) {


            Scanner input = new Scanner(System.in);


        /*Write an application that reads a series of pairs of numbers as follows:
                a) product number
                b) quantity sold
        Your program should use a switch statement to determine the retail price for each product. It should calculate and
        display the total retail value of all products sold.
        Use a sentinel-controlled loop to determine when the program should stop looping and display the final results.*/

            boolean done = false;
            double p1 = 0.0;
            double p2 = 0.0;
            double p3 = 0.0;
            double p4 = 0.0;
            double p5 = 0.0;
            int n = 1;
            int product;
            int quantity;

            System.out.println("Enter -1 to exit");

//            System.out.print("Enter Product number: ");
//            product = input.nextInt();
//
//            System.out.print("Enter quantity sold: \n");
//            quantity = input.nextInt();


            while (!done) {
                System.out.print("Enter Product number: ");
                product = input.nextInt();

                if (product == -1)
                    break;

                System.out.print("Enter quantity sold: ");
                quantity = input.nextInt();

                System.out.println();

                switch (product) {
                    case 1:
                        p1 = quantity * 2.98;
                        break;

                    case 2:
                        p2 = quantity * 4.50;
                        break;

                    case 3:
                        p3 = quantity * 9.98;
                        break;

                    case 4:
                        p4 = quantity * 4.49;
                        break;

                    case 5:
                        p5 = quantity * 6.87;
                        break;

                    default:
                        System.out.println("Invalid Choice! ");
                        break;
                }

            }

//            if (product == 1)
//                System.out.printf("%.2f", p1);
//
//            else if (product == 2)
//                System.out.printf("%.2f", p2);
//
//            else if (product == 3)
//                System.out.printf("%.2f", p3);
//
//            else if (product == 4)
//                System.out.printf("%.2f", p4);
//
//            else if (product == 5)
//                System.out.printf("%.2f", p5);


            System.out.printf("the total of product 1 is %.2f\n", p1);
            System.out.printf("the total of product 2 is %.2f\n", p2);
            System.out.printf("the total of product 3 is %.2f\n", p3);
            System.out.printf("the total of product 4 is %.2f\n", p4);
            System.out.printf("the total of product 5 is %.2f\n", p5);




    }

}

