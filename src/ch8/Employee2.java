package us.shairyar.deiteljava.ch8;

/**
 * Created by shairyarshafqat on 3/24/15.
 */
// Fig. 8.12: Employee.java
// Static variable used to maintain a count of the number of
// Employee objects in memory.

public class Employee2
{
    private String firstName;
    private String lastName;
    private static int count = 0; // number of objects in memory

    // initialize employee, add 1 to static count and
    // output String indicating that constructor was called
    public Employee2( String first, String last )
    {
        firstName = first;
        lastName = last;

        count++;  // increment static count of employees
        System.out.printf( "Employee constructor: %s %s; count = %d\n",
                firstName, lastName, count );
    } // end Employee constructor

    // subtract 1 from static count when garbage
    // collector calls finalize to clean up object;
    // confirm that finalize was called
    protected void finalize()
    {
        count--; // decrement static count of employees
        System.out.printf( "Employee finalizer: %s %s; count = %d\n",
                firstName, lastName, count );
    } // end method finalize

    // get first name
    public String getFirstName()
    {
        return firstName;
    } // end method getFirstName

    // get last name
    public String getLastName()
    {
        return lastName;
    } // end method getLastName

    // static method to get static count value
    public static int getCount()
    {
        return count;
    } // end method getCount
} // end class Employee

