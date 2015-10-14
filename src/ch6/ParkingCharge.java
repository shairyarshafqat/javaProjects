package us.shairyar.deiteljava.ch6;

/**
 * Created by shairyarshafqat on 11/5/14.
 */
import java.util.Scanner;

public class ParkingCharge {

    // A parking garage charges a $2.00 minimum fee to park for up to three hours.
    public static double inputParking()
    {
        Scanner input = new Scanner(System.in);

        double fee = 2.00;
        double fixed = 10.00;
        int hours = 0;

        System.out.println("Enter hours parked: ");
        hours = input.nextInt();

        if(hours >= 24)
            System.out.printf("your total is $%.2f" , fixed);

        else if(hours > 3)
        {
            hours -= 3;
            double surcharge = 0.50;
            surcharge *= hours;

            double total = surcharge + fee;
            System.out.printf("the total charge for your parking is $%.2f", total);
        }
        else
        {
            System.out.printf("the total charge for your parking is $%.2f" , fee);
        }


        return fee;

    }
    // The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three hours.
    // The maximum charge for any given 24-hour period is $10.00.
    // Assume that no car parks for longer than 24 hours at a time.
    // Write an application that calculates and displays the parking charges for each customer who parked in the garage yesterday.
    // You should enter the hours parked for each customer.
    // The program should display the charge for the current customer and should calculate and display the running total of yesterday’s receipts.
    // It should use the method calculateCharges to determine the charge for each customer.

    public static void main(String[] args) {

        // take the data from the user
        ParkingCharge.inputParking();

        // calculate the parking
//        ParkingCharge.calcParking();

        // output the results
//        ParkingCharge.outputParking();
    }
}
