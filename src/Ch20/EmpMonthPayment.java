package us.shairyar.deiteljava.Ch20;

import java.io.*;

/**
* Created by shairyarshafqat on 3/9/15.
*/


// driver class
public class EmpMonthPayment {
    public static void main(String[] args) throws IOException {
//       create keyboard stream and data variables
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        Question3_EmployeeData[] data = new Question3_EmployeeData[3];
        for (int i = 0; i < data.length; i++)
        {
            // declare variables
            String jobStatus;
            String id;
            String name;
            String hireDate;
            String jobStat;
            String addEmployee = "";
            String delEmployee = "";
            double weeklySalary;
            double groupSalary = 0.0;
            int totalHours;
            int totalOT;
            // create instance for Employee Details
            System.out.print("Enter employee Job Status Full Time or Part Time: ");
            jobStat = stdin.readLine();
            System.out.print("Enter employee ID: ");
            id = stdin.readLine();
            System.out.print("Enter employee Name: ");
            name = stdin.readLine();
            System.out.print("Enter employee Hire date: ");
            hireDate = stdin.readLine();
            System.out.print("Enter a employee Weekly Salary: ");
            weeklySalary = Double.valueOf(stdin.readLine()).doubleValue();
            System.out.print("Enter Part Time employee Total Working Hours in a month: ");
            totalHours = Integer.parseInt(stdin.readLine());
            System.out.print("Enter Part Time employee Total OverTime Hours in a month: ");
            totalOT = Integer.parseInt(stdin.readLine());
            //  create a EmployeeData object
            data[i] = new Question3_EmployeeData(id, name, hireDate, weeklySalary);
            data[i] = new Manager(id, name, hireDate, weeklySalary, groupSalary, addEmployee, delEmployee);
            if(jobStat.equals("Full Time"))
            {
                data[i] = new FullTimeEmployee(id, name, hireDate, weeklySalary);
            }
            else
            {
                data[i] = new PartTimeEmployee(id, name, hireDate, weeklySalary, totalHours, totalOT);
            }
        }
        System.out.println("The Employees details are:");
        System.out.println();
        System.out.println("ID\t Name\t\tHireDate\tWeekly Salary");
        System.out.println("-------------------------------------------------------------------");
/// run through each element of the array
        for (int i = 0; i < data.length; i++)
        {
            displayData(data[i]);
        }
    }
    // Display Data
    public static void displayData(Question3_EmployeeData in)
    {
        System.out.println(in.getId() +
                "\t" + in.getName() +
                "\tN/A\t" + in.getHireDate() +
                "\t" + in.getPay());
    }
}
//Employee class: stores data of an employee.
class Question3_EmployeeData
{
    private String name;
    private String id;
    private String hireDate;
    public double pay;
    //   constructor
    Question3_EmployeeData()
    {
        id = " ";
        name = "Unknown Item";
        hireDate = " ";
        pay = 0.0;
    }
    //     another constructors
    Question3_EmployeeData(String id, String name, String hireDate, double pay)
    {
        this.id = id;
        this.name = name;
        this.hireDate = hireDate;
        this.pay = pay;
    }
    // mutators for variables
    public void setId(String id)
    {
        this.id= id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setHireDate(String hireDate)
    {
        this.hireDate = hireDate;
    }
    public void setPay(double pay)
    {
        this.pay = pay;
    }
    // accessors for variables
    public String getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public String getHireDate()
    {
        return hireDate;
    }
    public double getPay()
    {
        return pay;
    }
}
// Full Time Employee Class
class FullTimeEmployee extends Question3_EmployeeData
{
    //   salary constant
    public static final double SALARY = 4.3;
    // default constructor
    FullTimeEmployee()
    {
        super();
    }
    //   full constructor
    FullTimeEmployee(String id, String name, String hireDate, double pay)
    {
        super(id, name, hireDate, pay);
    }
    // overridden inc salary accessor
    public double getPay()
    {
        return super.getPay()* SALARY;
    }
}
// Part Time Employee Class
class PartTimeEmployee extends Question3_EmployeeData
{
    public static final double NORMAL_HOURLY_RATE = 25;
    public static final double OT_HOURLY_RATE = 50;
    // class variables
    public int totalHours;
    public int totalOT;
    // default constructor
    PartTimeEmployee()
    {
        super();
        totalHours = 0;
        totalOT = 0;
    }
    // full constructor
    PartTimeEmployee(String id, String name, String hireDate, double pay, int totalHours, int totalOT)
    {
        super(id, name, hireDate, pay);
        this.totalHours = totalHours;
        this.totalOT = totalOT;
    }
    //   country of origin accessor
    public int getTotalHours()
    {
        return totalHours;
    }
    public int getTotalOT()
    {
        return totalOT;
    }
    //    overridden getPay() accessor
    public double getPay()
    {
        return(this.getTotalHours()*NORMAL_HOURLY_RATE) +
                (this.getTotalOT()*(OT_HOURLY_RATE));
    }
}
class Manager extends Question3_EmployeeData
{
    Manager[] supervise = new Manager[100];
    //    class variables
    public double groupPay;
    public String addEmployee;
    public String delEmployee;
    //  default constructor
    Manager()
    {
        super();
        addEmployee = "";
        delEmployee = " ";
        groupPay = 0.0;
    }
    Manager(String id, String name, String hireDate, double pay, double groupPay, String addEmployee, String delEmployee)
    {
        super(id, name, hireDate, pay);
        this.groupPay = groupPay;
        this.addEmployee = addEmployee;
        this.delEmployee = delEmployee;
    }
    public String getAddEmployee(String id, String name, String hireDate, double pay)
    {
        return addEmployee;
    }
    public String getDelEmployee(String id, String name, String hireDate, double pay)
    {
        return delEmployee;
    }
    public double getGroupPay()
    {
        return getPay();
    }
}


