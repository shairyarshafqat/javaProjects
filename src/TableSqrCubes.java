//import java.util.Scanner;

// 2.31

public class TableSqrCubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner input = new Scanner(System.in);
		
		int num1 = 2;
		int sqr;
		int cube;
		
		//System.out.print("Enter an integer: ");	
		//num1 = input.nextInt();

		sqr = (int) Math.pow(num1, 2);
		cube = (int)Math.pow(num1, 3);
		
		if (num1 < 10){
		System.out.println("Number\tSquare\tCube");
		System.out.print(num1 + "\t");
		System.out.print(sqr + "\t");
		System.out.print(cube + "\t");
	
		}	
	
	
	}

}
