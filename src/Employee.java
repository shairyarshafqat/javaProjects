
public class Employee {
	
	// three instance variables--a first
	//name (type String), a last name (type String) 
	//and a monthly salary (double)
	
	private String firstName;
	private String lastName;
	private double salary;
	
	// Provide a constructor that initializes the three instance variables. 
	public Employee(String name, String LName, double salary)
	{
		this.firstName = name;
		this.lastName = LName;
		if (salary > 0)
		this.salary = salary;
	}
	// Provide a set and a get method for each instance variable. 
	
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
	public void setLastName(String Lname)
	{
		lastName = Lname;
	}
	
	// get method last name
	public String getLastName()
	{
		return lastName;
	}
	
	// set method for salary
	public void setSalary(double salary)
	{
		if (salary > 0)
			this.salary = salary;	}
	
	// get method for salary
	public double getSalary()
	{
		return salary;
	}
	// If the monthly salary is not positive, do not set its value.
	
	
	
	
	
}
