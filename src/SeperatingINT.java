import java.util.Scanner;

// Exercise 2.30

public class SeperatingINT {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1;
		int result;
		
		
		System.out.print("Enter an integer: ");	
		
		num1 = input.nextInt();
		//
		int ans = num1 / 10000;
		result = num1 % 10000;
			
		System.out.print("answer:" + ans + " ; remainder: " + result);	
		
		//
		ans = result / 1000;
		result = result % 1000;
		//
		System.out.print("\tanswer:" + ans + " ; remainder: " + result);
	
		//
		ans = result / 100;
		result = result % 100;
		//
		System.out.print("\tanswer:" + ans + " ; remainder: " + result);
		
		//
		ans = result / 10;
		result = result % 10;
		//
		System.out.print("\tanswer:" + ans + " ; remainder: " + result);
		
		//
		ans = result / 1;
		result = result % 1;
		//
		System.out.print("\tanswer:" + ans + "; remainder: " + result);
		
		
		System.out.println();
	}

	
}
