


public class Gradebook 
{
	private String courseName;
	
	private String instructorName;
	
	public static String subject;
	
	public Gradebook(String x, String y)
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
}

