package us.shairyar.deiteljava.ch9;

/**
 * Created by shairyarshafqat on 4/2/15.
 */
// Fig. 9.10: BasePlusCommissionEmployee3.java
// BasePlusCommissionEmployee3 inherits from CommissionEmployee2 and has
// access to CommissionEmployee2's protected members.

public class BasePlusCommissionEmployee3 extends CommissionEmployee2
{
    private double baseSalary; // base salary per week

    // six-argument constructor
    public BasePlusCommissionEmployee3( String first, String last, String ssn, double sales, double rate, double salary )
    {
        super( first, last, ssn, sales, rate );
        setBaseSalary( salary ); // validate and store base salary
    } // end six-argument BasePlusCommissionEmployee3 constructor

    // set base salary
    public void setBaseSalary( double salary )
    {
        baseSalary = ( salary < 0.0 ) ? 0.0 : salary;
    } // end method setBaseSalary

    // return base salary
    public double getBaseSalary()
    {
        return baseSalary;
    } // end method getBaseSalary

    // calculate earnings
    @Override
    public double earnings()
    {
        return getBaseSalary() + super.earnings();
    } // end method earnings

    // return String representation of BasePlusCommissionEmployee3
    @Override
    public String toString()
    {
        return String.format( "%s %s\n%s: %.2f", "base-salaried",
                super.toString(), "base salary", getBaseSalary() );
    } // end method toString
} // end class BasePlusCommissionEmployee3
