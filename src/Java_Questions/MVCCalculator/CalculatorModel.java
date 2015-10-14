package Java_Questions.MVCCalculator;

/**
 * Created by shairyarshafqat on 7/23/15.
 */
public class CalculatorModel {

    private int additionValue;
    private int subtractionValue;
//    private int multiplicationValue;
//    private int divisionValue;
//    private int remainderValue;

    // method for collecting all the values
    public void addTwoNumbers(int firstnumber, int secondnumber)
    {
        additionValue = firstnumber + secondnumber;
    }

    public void subtractTwoNumbers(int firstnumber2, int secondnumber2)
    {
        subtractionValue = firstnumber2 - secondnumber2;
    }

//    public void multiplyTwoNumbers(int firstnumber, int secondnumber)
//    {
//        multiplicationValue = firstnumber * secondnumber;
//    }
//
//    public void divideTwoNumbers(int firstnumber, int secondnumber)
//    {
//        divisionValue = firstnumber / secondnumber;
//    }
//
//    public void remainderTwoNumbers(int firstnumber, int secondnumber)
//    {
//        remainderValue = firstnumber % secondnumber;
//    }

    // getter methods for all the values
    public int getAdditionValue()
    {
        return additionValue;
    }

    public int getSubtractionValue()
    {
        return subtractionValue;
    }

//    public int getMultiplicationValue()
//    {
//        return multiplicationValue;
//    }
//
//    public int getDivisionValue()
//    {
//        return divisionValue;
//    }
//
//    public int getRemainderValue()
//    {
//        return remainderValue;
//    }
}

