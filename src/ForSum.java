/**
 * Created by shairyarshafqat on 10/17/14.
 */
public class ForSum {

    public static void main(String[] args) {

        // create a for loop that takes the sum of 2 all the way to 20

        int total = 0;
        int counter = 2;
        int number = 2;
        int sum = 0;

        for(counter = 2; counter <= 20; total += counter, counter += 2) {
            System.out.println("the sum of 2 to 20 is " + total);

        }




        System.out.println();
        System.out.println("the sum of 2 to 20 is " + total);

        while(number <= 10)
        {

            sum += number;
            number +=  2;


            number++;


        }

        System.out.println();
        System.out.println();
        System.out.println("tafds" + sum);

    }




}
