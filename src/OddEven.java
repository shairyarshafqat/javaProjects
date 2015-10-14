import java.util.Scanner;

// exercise 2.25

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int num1;
		System.out.print("Enter an integer: ");
		num1 = input.nextInt();
		
	//	System.out.print("Enter an integer: ");
	//	num2 = input.nextInt();
		
		num1 = num1 % 2;
		
		if (num1 != 0){
		System.out.println("It's is an odd number.");
		}
		
		else {
			System.out.println("It's an even number.");
		}
		
	}

}

