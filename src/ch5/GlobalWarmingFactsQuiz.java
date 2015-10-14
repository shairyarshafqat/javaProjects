package us.shairyar.deiteljava.ch5;

/**
 * Created by shairyarshafqat on 11/1/14.
 */
import java.util.Scanner;

public class GlobalWarmingFactsQuiz {

    public static void main(String[] args) {

        System.out.println("The controversial issue of global warming has been widely publicized by the film 'An Inconvenient Truth,'\n" +
                "featuring former Vice President Al Gore. Mr. Gore and a U.N. network of scientists, the Intergovernmental Panel on \n" +
                "Climate Change, shared the 2007 Nobel Peace Prize in recognition of “their efforts to build up \n" +
                "and disseminate greater knowledge about man-made climate change.\n");

//       initialize for question 1

        int q1 = 0;
        int q2 = 0;
        int q3 = 0;
        int q4 = 0;
        int q5 = 0;
        int total = 0;

        Scanner input = new Scanner(System.in);


        // Question 1
        System.out.println("Which of the following is a greenhouse gas that is " +
                "released by human activities and speeds up global warming?");

        System.out.println("1. Petroleum");
        System.out.println("2. Natural Gas");
        System.out.println("3. Carbon dioxide");
        System.out.println("4. Nuclear power");

        System.out.print("\nEnter your answer(1-4): ");
        q1 = input.nextInt();

        if(q1 == 3)
        {
            System.out.println("\nCorrect!");
            System.out.println("Carbon emissions are projected to reach 7,958 million metric tons in 2030.\n");
        }
        else
        {
            System.out.println("\nWrong answer.\nThe correct answer is, 3. Carbon dioxide");
            System.out.println("Carbon emissions are projected to reach 7,958 million metric tons in 2030.\n");
        }

        // Question 2
        System.out.println("Which of the following human activities does NOT release carbon dioxide into the atmosphere?");

        System.out.println("1. Burning fossil fuels");
        System.out.println("2. Fishing");
        System.out.println("3. Deforestation");
        System.out.println("4. Driving");

        System.out.print("\nEnter your answer(1-4): ");
        q2 = input.nextInt();

        if(q2 == 2)
        {
            System.out.println("\nCorrect!");
            System.out.println("In 2006, 82% of U.S. carbon emissions were from the combustion of energy fuels.\n");
        }
        else
        {
            System.out.println("\nWrong answer.\nThe correct answer is, 2. Fishing");
            System.out.println("In 2006, 82% of U.S. carbon emissions were from the combustion of energy fuels.\n");
        }

        if(q1 == 3 )
        {
            q1 = 1;
            total += q1;
        }
        if(q2 == 2)
        {
            q2 = 1;
            total+= q2;
        }



        if(total == 2)
        {
            System.out.println("Excellent!\nYour total is " + total);
            System.out.println();
        }

        else if(total == 1)
        {
            System.out.printf("Very Good!\nYour total is "+ total);
            System.out.println();
        }

        else
        {
            System.out.println("Time to brush up on your knowledge of global warming\nYour total is " + total);
            System.out.println();
        }

        System.out.println("http://www.factmonster.com/quizzes/global-warming/1.html");



//        Question 3











    }
}
