/**
 * Created by shairyarshafqat on 10/7/14.
 */
import java.util.Scanner;

public class SalaryCalc {

    public static void main(String[] args) {

//        Develop a Java application that determines the gross pay for each of three employees

        Scanner input = new Scanner(System.in);

        boolean done = false;
        int employee = 0;
        double salary = 0.0;
        double hours = 0.0;
        double total = 0.0;

        while(!done)
        {
            System.out.println("enter employee number: ");
            employee = input.nextInt();
            if(employee == -1)
                break;

            System.out.println("Enter employee hourly rate: ");
            salary = input.nextDouble();

            System.out.println("Enter hours: ");
            hours = input.nextDouble();

            if(hours <= 40)
                total =  salary * hours;

            else if (hours > 40)
                total = 1.50 * salary * hours;

            System.out.printf("Employee number %d worked %.1f hours, therefore it's salary for the week is %.2f\n", employee, hours, total);
            System.out.println();
        }

//        Develop a Java application that determines the gross pay for each of three employees.
// The company pays straight time for the first 40 hours worked by each employee and time and a half for
// all hours worked in excess of 40.
// You’re given a list of the employees, their number of hours worked last week and their hourly rates.
// Your program should input this information for each employee, then determine and display the employee’s gross pay.
// Use class Scanner to input the data.



    }



}
