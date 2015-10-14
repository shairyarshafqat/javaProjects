
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee clerk1 = new Employee("Shairyar", "Shafqat", 100.0);
		Employee clerk2 = new Employee("Khalid" , "Ali", 100.0);
		
		System.out.println("Yearly salary of the employee's");
		
		System.out.println(clerk1.getFirstName()+" "+clerk1.getLastName()+" "+clerk1.getSalary());
		System.out.println(clerk2.getFirstName()+" "+clerk2.getLastName()+" "+clerk2.getSalary());
	}

}
