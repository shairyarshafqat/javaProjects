package Java_Questions.MVC;

/**
 * Created by shairyarshafqat on 7/23/15.
 */
public class MVCAddition {

    public static void main(String[] args) {

        AdditionView theView = new AdditionView();

        AdditionModel theModel = new AdditionModel();

        AdditionController theController = new AdditionController(theView, theModel);

        theView.setVisible(true);
    }
}
