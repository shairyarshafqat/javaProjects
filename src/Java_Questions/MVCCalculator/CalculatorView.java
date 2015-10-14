package Java_Questions.MVCCalculator;

/**
 * Created by shairyarshafqat on 7/23/15.
 */
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorView extends JFrame{

    // for addition view
    private JTextField additionNumber1 = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField additionNumber2 = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);

    // for subtraction view
    private JTextField subtractionNumber1 = new JTextField(10);
    private JLabel subtractionLabel = new JLabel("-");
    private JTextField subtractionNumber2 = new JTextField(10);
    private JButton calculateButton2 = new JButton("Calculate");
    private JTextField calcSolution2 = new JTextField(10);

    CalculatorView()
    {
        // for addition
        JPanel calcPanel1 = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calcPanel1.add(additionNumber1);
        calcPanel1.add(additionLabel);
        calcPanel1.add(additionNumber2);
        calcPanel1.add(calculateButton);
        calcPanel1.add(calcSolution);

        this.add(calcPanel1);

        // for subtraction
        JPanel calcPanel2 = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calcPanel2.add(subtractionNumber1);
        calcPanel2.add(subtractionLabel);
        calcPanel2.add(subtractionNumber2);
        calcPanel2.add(calculateButton2);
        calcPanel2.add(calcSolution2);

        this.add(calcPanel2);

    }

    // methods for addition
    public int getAdditionNumber1()
    {
        return Integer.parseInt(additionNumber1.getText());
    }

    public int getAdditionNumber2()
    {
        return Integer.parseInt(additionNumber2.getText());
    }

    public int getCalcSolution()
    {
        return Integer.parseInt(calcSolution.getText());
    }

    public void setCalcSolution(int solution)
    {
        calcSolution.setText(Integer.toString(solution));
    }

    void addCalculationListerner(ActionListener listenForCalcButton)
    {
        calculateButton.addActionListener(listenForCalcButton);
    }

    // methods for subtractions
    public int getsubtractionNumber1()
    {
        return Integer.parseInt(subtractionNumber1.getText());
    }

    public int getsubtractionNumber2()
    {
        return Integer.parseInt(subtractionNumber2.getText());
    }

    public int getCalcSolution2()
    {
        return Integer.parseInt(calcSolution2.getText());
    }

    public void setCalcSolution2(int solution)
    {
        calcSolution2.setText(Integer.toString(solution));
    }

    void subtractCalculationListerner(ActionListener listenForCalcButton2)
    {
        calculateButton2.addActionListener(listenForCalcButton2);
    }



    void displayErrorMessage(String errorMessage)
    {
        JOptionPane.showMessageDialog(this, errorMessage);
    }


}
