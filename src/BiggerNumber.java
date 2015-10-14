import java.util.Scanner;

public class BiggerNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.print("Enter First Integer: ");
		num1 = input.nextInt();
		
		System.out.print("Enter Second Integer: ");
		num2 = input.nextInt();
		
		if (num1 == num2)
			System.out.println(num1 + "These numbers are equal" + num2);
		
		if (num1 > num2)
			System.out.println(num1 + "is larger" + num2);
		
		else
			System.out.println("Error, try again!");
		
		
	}
		
		
}
