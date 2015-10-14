import java.util.Scanner;
import java.lang.Math;

public class HealthProfileTest {

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
		
		System.out.println("enter your weight in pounds: ");
		int weight = input.nextInt();
		
		System.out.println("Enter your height in inches: ");
		int height = input.nextInt();
		
		
		HealthProfile myHP = new HealthProfile(FirstName, LastName, month, day, year, weight, height);
		
		System.out.println("your first name is: " + myHP.getFirstName());
		System.out.println("your last name is: " + myHP.getLastName());
		System.out.println("your Date of birth is: " + month + "/" + day +"/" +year);
		System.out.println("your age is: " + myHP.getAge());
		System.out.println("your maximum heart rate is: "+ myHP.MHR());
		
		// target heart rate 
		myHP.THR();
		
		// BMI 
		System.out.println("your height is " + myHP.getHeight() );
		System.out.println("your weight is " + myHP.getWeight());
		System.out.println("your BMI is " + myHP.BMI(height, weight));
	
		// BMI chart
		System.out.println("\nBMI VALUES \n"
				+ "Underweight: less than 18.5 \n"
				+ "Normal:between 18.5 and 24.9 \n"
				+ "Overweight:  between 25 and 29.9 \n"
				+ "Obese: 30 or greater"); 



	}

}


