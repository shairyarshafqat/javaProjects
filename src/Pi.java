import java.lang.Math; // importing math package
import java.util.Scanner;// Scanner class


public class Pi {

//Exercise 2.18
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int r;
		
		System.out.print("Enter an integer: ");	
		r = input.nextInt();
		System.out.println(r); // Empty Space
		
		double diameter = 2 * r;
		double circumference = 2 * Math.PI * r; 
		double area = Math.PI * Math.pow(r, 2) ;
		
		
		//r = num1 * Math.PI;
	
		System.out.println("The diameter of the circle is " + diameter + ".");	
		System.out.println("The circumference of the circle is " + circumference + ".");	
		System.out.println("The area of the circle is " + area + ".");	

		
	}

}
