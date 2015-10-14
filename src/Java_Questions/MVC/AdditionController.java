package Java_Questions.MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by shairyarshafqat on 7/23/15.
 */
public class AdditionController {

    private AdditionView theView;
    private AdditionModel theModel;

    public AdditionController(AdditionView theView, AdditionModel theModel)
    {
        this.theModel = theModel;
        this.theView = theView;

        this.theView.addCalculationListerner(new CalculateListener());
    }

    class CalculateListener implements ActionListener{


        public void actionPerformed(ActionEvent e)
        {
            int firstNumber, secondNumber = 0;

            try
            {
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                theModel.addTwoNumbers(firstNumber, secondNumber);
                theView.setCalcSolution(theModel.getCalculationValue());
            }

            catch (NumberFormatException ex)
            {
                theView.displayErrorMessage("You need to enter 2 Integers.");
            }

        }
    }
}
