package Java_Questions.MVCCalculator;

/**
 * Created by shairyarshafqat on 7/23/15.
 */
public class CalculatorMVC {

    public static void main(String[] args) {

        CalculatorView theView = new CalculatorView();

        CalculatorModel theModel = new CalculatorModel();

        CalculatorController theController = new CalculatorController(theView, theModel);


        theView.setVisible(true);
    }
}
