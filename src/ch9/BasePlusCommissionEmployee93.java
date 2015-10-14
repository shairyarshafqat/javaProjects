package us.shairyar.deiteljava.ch9;

/**
 * Created by shairyarshafqat on 4/7/15.
 */

/* 9.3 Many programs written with inheritance could be written with composition instead, and vice versa.
Rewrite class BasePlusCommissionEmployee (Fig. 9.11) of the CommissionEmployeeBasePlusCommissionEmployee hierarchy to
use composition rather than inheritance.
*/

public class BasePlusCommissionEmployee93 {

    private BasePlusCommissionEmployee3 employee;

    public BasePlusCommissionEmployee93(BasePlusCommissionEmployee3 employee) {
        this.employee = employee;
    }

    public String toString()
    {
        return String.format("%s", employee);
    }

}
