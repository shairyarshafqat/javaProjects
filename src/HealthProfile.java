import java.util.Calendar;
import java.lang.Math;
 
// HealthProfile class for a person.
public class HealthProfile {

	// The class attributes should include the person's first name, last name, gender, date of birth 
	//(consisting of separate attributes for the month, day and year of birth), height (in inches) and weight (in pounds). 

	private String firstName;
	private String lastName;
	private int month, day, year;
	private int dateOfBirth;
	private int Age;
	private int THR;
	private int BMI;
	private int Height;
	private int Weight;
	
	
	// Your class should have a constructor that receives this data as parameters. 
	public HealthProfile(String firstName, String lastName, int month, int day, int year, int weight, int height)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.month = month;
		this.day = day;
		this.year = year;
		this.Height = height;
		this.Weight = weight;
	}
	
	// set method First name
	public void setFirstName(String name)
	{
		firstName = name;
	}
	
	// get method First name
	public String getFirstName()
	{
		return firstName;
	}
	
	// set method for last name
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	// get method last name
	public String getLastName()
	{
		return lastName;
	}
	
	// set method for date of birth
	public void setDateOfBirth(int month, int day, int year)
	{
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public int getDateOfBirth()
	{
		return dateOfBirth;
	}
	
	public void setAge(int age)
	{
			this.Age = age;
	}

	public int getAge()
	{
		Calendar cd = Calendar.getInstance();
		   return (cd.get(Calendar.YEAR)) - year;
	}
	
	public int MHR()
	{
		return 220 - getAge();
	}
	
	public int THR()
	{
		System.out.println("Your target hear rate range is " + MHR() * 0.5 + " to " + MHR() * 0.85 );
		return THR;
	}
	public void setHeight(int height)
	{
		this.Height = height;
	}
	public int getHeight()
	{
		return Height;
	}
	
	public void setWeight(int weight)
	{
		this.Weight = weight;
	}
	public int getWeight()
	{
		return Weight;
	}
		
	public int BMI(int weight, int height)
	{
		return (int) ((getWeight() / Math.pow(getHeight(), 2)) * 703);
	}
		
}	