package Java_Questions.MVCCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by shairyarshafqat on 7/23/15.
 */
public class CalculatorController {
    private CalculatorView theView;
    private CalculatorModel theModel;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel)
    {
        this.theModel = theModel;
        this.theView = theView;

        this.theView.addCalculationListerner(new CalculateListener());
    }

    class CalculateListener implements ActionListener {


        public void actionPerformed(ActionEvent e)
        {
            int firstNumber, secondNumber = 0;

            try
            {
                firstNumber = theView.getAdditionNumber1();
                secondNumber = theView.getAdditionNumber2();

                theModel.addTwoNumbers(firstNumber, secondNumber);
                theView.setCalcSolution(theModel.getAdditionValue());
            }

            catch (NumberFormatException ex)
            {
                theView.displayErrorMessage("You need to enter 2 Integers.");
            }

        }

    }
}
