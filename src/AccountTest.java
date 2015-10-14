import java.util.Scanner;

//Inputting and outputting floating-point numbers with Account objects.

public class AccountTest {
	
	// main method begins execution of java app
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create account object(account1 , account2)
		Account account1 = new Account(50.00); 
		Account account2 = new Account(-7.53);
		
		
		// display initial balance of each accounts
		System.out.println("account1: " + account1.getBalance());
		System.out.println("account2: " + account2.getBalance() + "\n");
		
		// create Scanner to obtain input from CW
		Scanner input = new Scanner(System.in);
		
		// deposit amount read from the user
		double depositAmount;
		
		// prompt
		System.out.print("Enter deposit amount for account1: ");
		depositAmount = input.nextDouble();
		
		System.out.println("adding " + depositAmount +" to account1 balance\n");
		account1.credit(depositAmount);
		
		// display balances
		System.out.println("Account1 balance: "+ account1.getBalance());
		System.out.println("Account2 balance: "+ account2.getBalance()+ "\n");
		
		// prompt
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		
		System.out.println("adding " + depositAmount +" to account2 balance" + "\n");
		account2.credit(depositAmount);
		
		// displaying balances
		System.out.println("account1 balance: "+ account1.getBalance());
		System.out.println("account2 balance: "+ account2.getBalance());
		
		// debit an amount from an existing account
		System.out.print("enter amount to withdraw: ");
		double z = input.nextDouble();
		
		boolean x = account1.debit(z);
		if (x == true){
			System.out.println("success");
		}
		else{
			System.out.println("insufficient funds.");
		}
		
		System.out.println("Your current balance is " + account1.getBalance());



	}// end main

}// end class AccountTest
