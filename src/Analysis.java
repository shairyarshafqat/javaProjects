/**
 * Created by shairyarshafqat on 10/4/14.
 */
import java.util.Scanner;

public class Analysis
          {

            // A college offers a course that prepares students for the state licensing exam for real estate brokers.
            // Last year, ten of the students who completed this course took the exam. The college wants to know how well its students did on the exam.
            // You’ve been asked to write a program to summarize the results.
            // You’ve been given a list of these 10 students. Next to each name is written a 1 if the student passed the exam or a 2 if the student failed.
            // Your program should analyze the results of the exam as follows:
            //  1. Input each test result (i.e., a 1 or a 2). Display the message “Enter result” on the screen each time the program requests another test result.
            //  2. Count the number of test results of each type.
            //  3. Display a summary of the test results, indicating the number of students who passed and the number who failed.
           //   4. If more than eight students passed the exam, print the message “Bonus to instructor!”
            public static void main(String[] args) {


                int passes = 0;
                int failure = 0;
                int result;
                int studentCounter = 1;

                //studentCounter = 1    ;

                Scanner input = new Scanner(System.in);

                //System.out.print("Enter Student grade(1 is passes and 2 is failure): ");
                //result = input.nextInt();

                while (studentCounter <= 10) {

                    System.out.print("Enter Student grade(1 is passes and 2 is failure): ");
                    result = input.nextInt();

                    if(result == 1)
                        passes += 1;

                    else
                        failure += 1;

                    studentCounter++;
                }

                System.out.printf("passes: %d\nfailure: %d\n", passes, failure);

                if(passes >= 8)
                    System.out.print("Bonus to instructor");


            }


}
