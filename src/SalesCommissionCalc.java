/**
 * Created by shairyarshafqat on 10/7/14.
 */
import java.util.Scanner;

public class SalesCommissionCalc {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean done = false;
        int itemNumber = 0;
        double price = 0.0;
        double total = 0.0;

        while(!done)
        {
            System.out.print("Enter item number (type '-1' to exit): ");
            itemNumber = input.nextInt();
            if(itemNumber == -1)
                break;

            System.out.print("Enter price of the item sold: ");
            price = input.nextDouble();


//            System.out.print("Enter price: ");

            total = 200.0 + 9.0 / 100.0 * price;


            System.out.printf("%d earned %.2f on a item of %.2f\n ", itemNumber, total, price);
            System.out.println();
        }
//        total = 9 / 100 * price;

//        inputs one salesperson’s items sold for last week
//        calculates
//        displays that salesperson’s earnings
//        There’s no limit to the number of items that can be sold.



    }



}
