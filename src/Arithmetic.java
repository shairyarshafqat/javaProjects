import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int sum;
		int product;
		int difference;
		int quotient;
		
		
		System.out.print("Enter First Number: ");
		num1 = input.nextInt();
		
		System.out.print("Enter Second Number: ");
		num2 = input.nextInt();
		
		sum = num1 + num2;
		product = num1 * num2;
		difference = num1 -  num2;
		quotient = num1 / num2;
		
		System.out.println(""); // blank line
		System.out.println("Sum is " + sum);
		System.out.println("Product is " + product);
		System.out.println("Differnece is " + difference);
		System.out.println("Quotient is " + quotient);
	}


}
