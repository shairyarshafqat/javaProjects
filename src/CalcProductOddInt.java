/**
 * Created by shairyarshafqat on 10/19/14.
 */
public class CalcProductOddInt {

    public static void main(String[] args) {

        int product = 1; // the product of all the odd numbers
        int i;

        int a = 1;
        int p = 1;

        // loop through all odd numbers from 3 to 15
        for (i = 1; i <= 15; i += 2) {
            if (i % 2 != 0)
                product = product * i;
        }


        // show results
        System.out.printf("the product is %d \n", product);


    }
}