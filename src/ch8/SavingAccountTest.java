package us.shairyar.deiteljava.ch8;

/**
 * Created by shairyarshafqat on 3/25/15.
 */

/*Instantiate two savingsAccount objects, saver1 and saver2, with balances of $2000.00 and $3000.00, respectively.
Set annualInterestRate to 4%, then calculate the monthly interest for each of 12 months and print the new balances for both savers.
Next, set the annualInterestRate to 5%, calculate the next month’s interest and print the new balances for both savers.
*/

public class SavingAccountTest {


    public static void main(String[] args) {

        SavingAccount saver1 = new SavingAccount(2000.00);
        SavingAccount saver2 = new SavingAccount(3000.00);

        // Interest at 4% and has 2 object name.
        SavingAccount.modifyInterestRate(4);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println();

        // Interest is at 5% and has 2 object name
        SavingAccount.modifyInterestRate(5);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();




    }


}
