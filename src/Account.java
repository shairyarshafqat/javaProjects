
public class Account {

	// instance variable that store the balance
	private double balance;
	
	// constructor
	public Account(double initialBalance)
	{
		// validate that initialBalance is greater than 0.0
		// if it is not, balance is initialized to the default value 0.0
		if (initialBalance > 0.0)
			balance = initialBalance;
	} // end Account constructor
	
	// credit (add) an amount to the account
	public void credit(double amount)
	{
		balance += amount; // add amount to balance
	} //end method credit
	
	// return the account balance
	public double getBalance()
	{
		return balance; // gives the value of the balance to the calling method
	} // end getBalance method
	
	// modify and create a method called debit that withdraws money from the account
	public boolean debit(double y)
	{
		if (y > balance){
			return false;
		}
		else {
			balance -= y;
			return true;
		}
	}
	
}// end class account 
