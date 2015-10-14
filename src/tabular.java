/**
 * Created by shairyarshafqat on 10/13/14.
 */
import java.util.Scanner;

public class tabular {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int total1 = 0;
        int total2 = 0;
        int total3 = 0;
        int counter = 0;

        System.out.println("N\tN˚10\tN˚100\tN˚1000");


        while(counter < 5)
        {
//            System.out.println("enter a number: ");
//            number = input.nextInt();

            counter++;


            total1 = counter * 10;
            total2 = counter * 100;
            total3 = counter * 1000;


            System.out.println(counter + "\t" + total1 + "\t\t" + total2 + "\t\t" + total3  );
        }




    }
}
