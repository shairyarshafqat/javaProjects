
public class BuyingACar {
	public static void main(String [] args)
	{
		// total gas cost
		int gascost = (50000/ 10) * 4 ; 
		// big engine, but a cheap car
		int totalcost1 = 15000 + 20000; 
		// Expensive Hybrid car, but cheap on gas
		int totalcost2 = 30000 + 4000; 
		
		// if-else statement for buying the perfect match
		if (totalcost1 < totalcost2 )
		{
			System.out.println("big V8 " + totalcost1);
		}
		else 
		{
			System.out.println("Hybrid car " + totalcost2);
		}
	}
	
}
