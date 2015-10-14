import java.util.Scanner;

// Sample Payroll Calculation
public class exer2_8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		System.out.print("Enter First number: ");// prompt
		b = input.nextInt(); // Read first number from user
		
		System.out.print("Enter Second number: ");// prompt
		c = input.nextInt();		
		
		a = b + c;
		
		System.out.println("a: " + a);// prompt

	}

}
