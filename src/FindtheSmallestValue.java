/**
 * Created by shairyarshafqat on 10/18/14.
 */
import java.util.Scanner;

public class FindtheSmallestValue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean done = false;

        int number;
        int smallest = 100;
        int counter = 1;

        while(!done)
        {
            System.out.print("Enter an integer or type '-1' to exit: ");
            number = input.nextInt();
            if(number == -1)
                break;

            else if (number < smallest)
                smallest = number;
//
//            if(number == -1)
//                break;


//            System.out.println("the smallest number is " + smallest);

        }

        System.out.println("the smallest number is " + smallest);
    }
}
