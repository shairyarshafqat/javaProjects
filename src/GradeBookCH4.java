import java.util.Scanner;

public class GradeBookCH4 {

	
		private String courseName;
		
		private String instructorName;
		
		public static String subject;
		
		public GradeBookCH4(String x, String y)
		{
			this.courseName = x;
			this.instructorName = y;
		}
		
		public void setInstructorName(String name)
		{
			this.instructorName = name;
		}
		
		public String getInstructorName()
		{
			return instructorName;
		}
		
		// method header
		public void displayMessage()
		{
			System.out.println("Welcome to the grade book for "+ this.courseName + " this course is presented by: "+ this.instructorName);
		}

		public void determineClassAverage()
		{
			Scanner input = new Scanner(System.in);
			
			int total;
			int gradeCounter;
			int grade;
			double average;
			
			
			total = 0;
			gradeCounter = 0;

            System.out.print("Enter first grade or press -1 to exit: ");
            grade = input.nextInt();


			while (grade != -1)
			{
				total += grade;
				gradeCounter ++;

                System.out.print("Enter student grade or press -1 to exit: ");
                grade = input.nextInt();
			}

            if(gradeCounter != 0)
            {
                average = (double) total / gradeCounter;

                System.out.printf("\nTotal of the %d grades entered is %d\n", gradeCounter, total);
                System.out.printf("Class average is %.2f\n", average);
            }

            else{
                System.out.println("No grades were entered.");
            }
			
			//System.out.println("The total of all the grades is "+ total);
			//System.out.println("the average of all the grades is " + average);
	}

}


