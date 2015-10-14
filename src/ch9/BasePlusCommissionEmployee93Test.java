package us.shairyar.deiteljava.ch9;

/**
 * Created by shairyarshafqat on 4/7/15.
 */
public class BasePlusCommissionEmployee93Test {

    public static void main(String[] args)
    {
        BasePlusCommissionEmployee3 employee = new BasePlusCommissionEmployee3("Bob", "Lewis", "333-33-3333", 5000, .04, 300 );
        BasePlusCommissionEmployee93 a = new BasePlusCommissionEmployee93(employee);
        System.out.println(a);
    }


}
