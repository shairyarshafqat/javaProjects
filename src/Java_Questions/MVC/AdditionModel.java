package Java_Questions.MVC;

/**
 * Created by shairyarshafqat on 7/23/15.
 */
public class AdditionModel {

    private int calculationValue;

    public void addTwoNumbers(int firstnumber, int secondnumber)
    {
        calculationValue = firstnumber + secondnumber;
    }

    public int getCalculationValue()
    {
        return calculationValue;
    }
}
