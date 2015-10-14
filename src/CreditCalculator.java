/**
 * Created by shairyarshafqat on 10/6/14.
 */
import java.util.Scanner;

public class CreditCalculator {

    // Develop a Java application that determines whether any of
    // several department-store customers has exceeded the credit limit on a charge account.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int accountnumber;
        int balanceBeginingMonth;
        int totalItemsMonth;
        int totalCreditsMonth;
        int allowedCredit;
        int newBalance = 0;
        boolean done = false;

        while(!done)
        {
            System.out.print("Enter account number: ");
            accountnumber = input.nextInt();

            if(accountnumber == -1)
                break;

            System.out.print("balance at the beginning of the month: ");
            balanceBeginingMonth = input.nextInt();

            System.out.print("total of all items charged by the customer this month: ");
            totalItemsMonth = input.nextInt();

            System.out.print("total of all credits applied to the customer’s account this month: ");
            totalCreditsMonth = input.nextInt();

            System.out.print("allowed credit limit: ");
            allowedCredit = input.nextInt();

//            if (accountnumber == -1)
//                break;

            newBalance = balanceBeginingMonth + totalItemsMonth - totalCreditsMonth;

        }

        if(newBalance > 0 )
            System.out.println("this is your new balance: " + newBalance);
        else
            System.out.println("Credit limit exceeded");

    }
}
