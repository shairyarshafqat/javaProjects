package us.shairyar.deiteljava.ch5;

/**
 * Created by shairyarshafqat on 10/20/14.
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class BarChart2 {

    private String projectName;

    public BarChart2(String project_name) {
        System.out.println("Initializing Barchar2()");

        //
        projectName = project_name;
    }

    private int number1;
    private int number2;
    private String input_str;

    public void setNumber1(int num1)
    {
        this.number1 = num1;
    }

    public int getNumber1()
    {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public boolean inputNumbers()
    {
        boolean Ret = false;

        Scanner input = new Scanner(System.in);

        // Write an application that reads five numbers between 1 and 30
        //    from a single row.

        // Read a line of input
        System.out.println("Enter 2 integers separated by space; int should fall between 1 through 30 inclusive: ");
        this.input_str = input.nextLine();

        Ret = true;

        input.close();

        return Ret;
    }

    public boolean testNumbers()
    {
        boolean Ret = false;

        // Parse the line of input; default delimiter is 'space'
        StringTokenizer tokenizer = new StringTokenizer(this.input_str);

        // define a counter
        int counter = 1;
        // read the tokens
        while(tokenizer.hasMoreTokens())
        {
            if (counter == 1) {
                // read the next token
                String val = tokenizer.nextToken();
                // convert the token 'val' to integer
                this.number1 = Integer.valueOf(val);
            }
            else if (counter == 2)
                this.number2 = Integer.valueOf(tokenizer.nextToken());

            counter++;
        }

        if (number1 >= 1 && number1 <= 30)
        {
            Ret = true;
        }
        else {
            System.out.println("number1 too big");
            Ret = false;
        }

        if (Ret == true)
            if (number2 >= 1 && number2 <= 30)
            {
                Ret = true;
            }
            else {
                System.out.println("number2 too big");
                Ret = false;
            }

        return Ret;
    }

    public boolean printBarChart()
    {
        boolean Ret = false;

        System.out.println("Printing the Bar Charts of project[" + this.projectName + ']');

        for (int i = 0; i < number1; i++)
            System.out.printf("%s", "*");
        System.out.println();

        for (int i = 0; i < number2; i++)
            System.out.printf("%s", "*");
        System.out.println();

        return Ret;
    }

    public static void main(String[] args) {

        String projectName = "Shairyar's project";

        BarChart2 barChart2 = new BarChart2(projectName);

        boolean Ret = barChart2.inputNumbers();

        if (Ret) {
            Ret = barChart2.testNumbers();

            if (Ret)
                barChart2.printBarChart();
        }

    }
}
