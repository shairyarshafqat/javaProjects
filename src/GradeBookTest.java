// fig 3.5: GradeBookTest
import java.util.Scanner;

// Driver class

public class GradeBookTest 
{

	public static void main(String[] args) 
	{
		// create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// TODO create a GradeBook object and assign it to myGradebook
		
		// Prompt for an input and coursename
		System.out.println("Enter course name:");
		String abc = input.nextLine();
		System.out.println("Enter instructor name: ");
		String def = input.nextLine();
		System.out.println();
		
		Gradebook myGradebook = new Gradebook(abc,def);

		// call myGradebook's displayMessage method
		// and pass nameOfCourse as an argument
		myGradebook.displayMessage();
		
		myGradebook.setInstructorName("Scooby doo");
		
		myGradebook.displayMessage();

		// myGradebook.displayMessage(nameOfCourse);
	}
}
