/**
 * Created by shairyarshafqat on 10/4/14.
 */
import java.util.Scanner;
public class GasMileage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // input the miles driven
        // gallons used (both as integers) for each trip

        boolean done = false;

        // The program should calculate and display the miles per gallon
        // obtained for each trip and print the combined miles per gallon obtained for all trips up to this point.

        int gallons;
        int milesDriven;
        int totalGallons = 0;
        int totalMiles = 0;
        int combined = 0;
        double average = 0.0;


        while(!done)
        {
            System.out.print("Enter miles per gallon: ");
            gallons = input.nextInt();

            System.out.print("Enter miles driven: ");
            milesDriven = input.nextInt();
            System.out.println();

            // if statement has to to take the sentinal value(-1) before all the calculations are done.
            if (gallons == -1 && milesDriven == -1)
                break;

            // calculations
            totalGallons += gallons;
            totalMiles += milesDriven;
            combined = totalGallons + totalMiles;
            average = (double) totalMiles / totalGallons;

        }
        System.out.println("Total gallons used: " + totalGallons);
        System.out.println("Total miles driven: " + totalMiles);
        System.out.println("MPG and Miles driven combined is " + combined);
        System.out.printf("the average of miles driven and MPG is %.2f \n", average);
    }



}
