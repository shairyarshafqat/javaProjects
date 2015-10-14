import java.util.Scanner;

public class HeartRatesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter First name: ");
		String FirstName = input.nextLine();
		
		System.out.println("Enter Last name: ");
		String LastName = input.nextLine();
		
		System.out.println("Enter DOB: ");
		int month = input.nextInt();
		int day = input.nextInt();
		int year = input.nextInt();
		// System.out.println(month + "/" + day + "/" + year);
		
		HeartRates myHR = new HeartRates(FirstName, LastName, month, day, year);
		
		System.out.println("your first name is:" + myHR.getFirstName());
		System.out.println("your last name is:" + myHR.getLastName());
		System.out.println("your Date of birth is:" + month + "/" + day +"/" +year);
		System.out.println("your age is:" + myHR.getAge());
		System.out.println("your maximum heart rate is: "+ myHR.MHR());
		
		// target heart rate 
		myHR.THR();

//        The class attributes should include the person’s first name, last name and date of birth (consisting of separate attributes for the month, day and year of birth).
// Your class should have a constructor that re- ceives this data as parameters. For each attribute provide set and get methods. The class also should include a method that calculates and returns the person’s age (in years), a method that calculates and returns the person’s maximum heart rate and a method that calculates and returns the person’s target heart rate.
// Write a Java application that prompts for the person’s information, instantiates an object of class HeartRates and prints the information from that object—including the person’s first name, last name and date of birth—then calculates and prints the person’s age in (years), maximum heart rate and target-heart-rate range.
	}


}

