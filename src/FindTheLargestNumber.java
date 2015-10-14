/**
 * Created by shairyarshafqat on 10/12/14.
 */
import java.util.Scanner;

public class FindTheLargestNumber {

    public static void main(String[] args) {

        int counter = 1;
        int number;
        int largest = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        number = input.nextInt();

        while(counter < 10)
        {
            System.out.println("Enter the number: ");
            number = input.nextInt();
            if(number > largest)
                largest = number;

            counter++;

        }





        System.out.println("the largest number is " + largest);
    }
}