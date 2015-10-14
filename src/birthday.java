import java.util.Scanner;

public class birthday {
	
		public static void main(System args []){
			
			System.out.println("Enter the year you were born in ");
			
			Scanner input = new Scanner(System .in);
			int yearBorn = input.nextInt();
			yearBorn= input.nextInt();
			int birthday;
			birthday= input.nextInt();
			
			System.out.println("your birthday is ");
			System.out.println( birthday );
			
			System.out.println("You will turn " 
			+ birthday + " in "
			+ (yearBorn + birthday));

			
		
		
	}
}
