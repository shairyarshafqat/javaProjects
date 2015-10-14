import java.util.Scanner;

/**
 * Created by shairyarshafqat on 12/13/14.
 */

public class AddAllNumbers {

    public static void main(String[] args) {

        int numbers = 0;
        boolean done= false;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        while(!done)
        {
            System.out.print("Enter the numbers\n(Enter '-1' to break out of the loop): ");
            numbers = input.nextInt();

            System.out.println();

            if(numbers == -1)
                break;

            sum += numbers;


        }
        System.out.printf("The sum of all the numbers you entered is %,d ", sum);





    }
}
