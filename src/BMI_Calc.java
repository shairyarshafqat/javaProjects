/**
 * 
 */

import java.util.Scanner; 

/**
 * @author shairyarshafqat
 *
 */
// 

public class BMI_Calc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create counters for height and weight
		int weight, height;
		
		// TODO Takes input from the user
		Scanner input = new Scanner(System.in);

		System.out.print("Enter weight in Pounds: ");
		weight = input.nextInt();
		
		System.out.print("Enter Height in Inches: ");
		height = input.nextInt();
		
		// TODO BMI Formula
		int BMI = (int) ((weight / Math.pow(height, 2)) * 703);
		
		// TODO Counts and displays the users BMI
		if(BMI < 18.5)
		{
		System.out.println(BMI + ", you are considered underweight. ");
		}
		
		else if(BMI > 18.5 && BMI < 24.9)
		{
		System.out.println(BMI + ", you are considered normal. ");
		}
		
		else if(BMI > 25 && BMI < 29.9)
		{
		System.out.println(BMI + ", you are considered overweight. ");
		}
		
		else
		{
		System.out.println(BMI + ", you are considered obese. ");
		}
		
		// BMI values chart
		System.out.println("\nBMI VALUES \n"
				+ "Underweight: less than 18.5 \n"
				+ "Normal:between 18.5 and 24.9 \n"
				+ "Overweight:  between 25 and 29.9 \n"
				+ "Obese: 30 or greater"); 
	}

}
