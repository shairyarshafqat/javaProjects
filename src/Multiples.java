import java.util.Scanner;

// Exercise 2.26

public class Multiples {

	public static void main(String[] args) {
		//  Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int divisible;
		
		System.out.print("Enter First integer: ");
		num1 = input.nextInt();
		
		
		System.out.print("Enter Second integer: ");
		num2 = input.nextInt();
		
		divisible = num1 % num2;
		
		if(divisible != 1){
			System.out.println("Both numbers are divisible. ");
			System.out.print("The result of both numbers is "+ divisible);

			}
		else{
			System.out.print("They are not divisble. ");
			
		}
		
	}

}
