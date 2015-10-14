package us.shairyar.deiteljava.ch8;

/**
 * Created by shairyarshafqat on 3/21/15.
 */
// Fig. 8.8: Employee.java
// Employee class with references to other objects.

public class Employee
{
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    // constructor to initialize name, birth date and hire date
    public Employee( String first, String last, Date dateOfBirth, Date dateOfHire )
    {
        firstName = first;
        lastName = last;
        birthDate = dateOfBirth;
        hireDate = dateOfHire;
    } // end Employee constructor

    // convert Employee to String format
    public String toString()
    {
        return String.format( "%s, %s  Hired: %s  Birthday: %s",
                lastName, firstName, hireDate, birthDate );
    } // end method toEmployeeString
} // end class Employee
