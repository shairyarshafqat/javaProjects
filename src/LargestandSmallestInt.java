
import java.util.Scanner;

public class LargestandSmallestInt {

	public static void main(String[] args) {
		// Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int number3;
		int number4;
		int number5;
		int largest;
		int smallest;
		
		
		System.out.print("Enter First Integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter Second Integer: ");
		number2 = input.nextInt();
		
		System.out.print("Enter Third Integer: ");
		number3 = input.nextInt();
		
		System.out.print("Enter Fourth Integer: ");
		number4 = input.nextInt();
		
		System.out.print("Enter Fifth Integer: ");
		number5 = input.nextInt();
		
		largest = number1;
        smallest = number1;

        if (number2 > largest)
            largest = number2;
        if (number3 > largest)
            largest = number3;
        if (number4 > largest)
            largest = number4;
        if (number5 > largest)
            largest = number5;

        if (number2 < smallest)
            smallest = number2;
        if (number3 < smallest)
            smallest = number3;
        if (number4 < smallest)
            smallest = number4;
        if (number5 < smallest)
            smallest = number5;

        System.out.println("Largest of five integers is " + largest + " and smallest is "+smallest + ".");
 
	
 }

		
}


