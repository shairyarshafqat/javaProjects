import java.util.Scanner;

// Driver class

public class GradeBookTestCH4Test
{

	public static void main(String[] args) 
	{
		// create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// TODO create a GradeBook object and assign it to myGradebook
		
		// Prompt for an input and coursename
		System.out.println("Enter course name:");
		String courseName = input.nextLine();
		System.out.println("Enter instructor name: ");
		String instructorName = input.nextLine();
		System.out.println();
		
		GradeBookCH4 myGradebook = new GradeBookCH4(courseName,instructorName);

		// call myGradebook's displayMessage method
		// and pass nameOfCourse as an argument
		myGradebook.displayMessage();
		
		myGradebook.determineClassAverage();
		//myGradebook.setInstructorName("Scooby doo");
		
		//myGradebook.displayMessage();

		// myGradebook.displayMessage(nameOfCourse);
	}
}