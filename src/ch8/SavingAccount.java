package us.shairyar.deiteljava.ch8;

/**
 * Created by shairyarshafqat on 3/25/15.
 */


public class SavingAccount {

    float interest = 3929.92f;

    // Use a static variable annualInterestRate to store the annual interest rate for all account holders.
    private static double annualInterestRate;

    // Each object of the class contains a private instance variable savingsBalance indicating the amount the saver currently has on deposit.
    private double savingsBalance;

    public SavingAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    //    Provide a static method modifyInterestRate that sets the annualInterestRate to a new value.

    public static void modifyInterestRate(double value)
    {
        annualInterestRate = value;
    }

//    Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying the savingsBalance by
// annualInterestRate divided by 12—this interest should be added to savingsBalance.

    public void calculateMonthlyInterest()
    {
        this.savingsBalance = savingsBalance * (annualInterestRate/100) * 12;

        System.out.printf("The monthly interest for 12 months is: %.2f \n" , savingsBalance);
    }



}
