/**
 * Created by shairyarshafqat on 10/17/14.
 */
import java.util.Scanner;

public class GradeBookSwitch
{

    private String courseName; // name of course this GradeBook represents
    // int instance variables are initialized to 0 by default
    private int total; // sum of grades
    private int gradeCounter; // number of grades entered
    private int aCount; // count of A grades
    private int bCount; // count of B grades
    private int cCount; // count of C grades￼￼
    private int dCount; // count of D grades
    private int fCount; // count of F grades

// constructor initializes courseName;
    public GradeBookSwitch( String name )
    {
       courseName = name; // initializes courseName
    } // end constructor

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayMessage()
    {
        System.out.printf("Welcome to the GradeBook for \n%s!\n\n", getCourseName());
    }

    public void inputGrades()
    {

        Scanner input = new Scanner(System.in);

        int grade;


        System.out.printf("%s\n%s\n   %s\n   %s\n",
                "Enter the integer grades in the range 0-100.",
                "Type the end-of-file indicator to terminate input: ",
                "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter.",
                "On Windows type <Ctrl> z then press Enter");


        while (input.hasNext()) {
            grade = input.nextInt();
            total += grade;
            ++gradeCounter;


            incrementLetterGradeCounter(grade);
        }

    }
    private void incrementLetterGradeCounter(int grade)
    {

        switch (grade / 10) {
            case 9:
            case 10:
                ++aCount;
                break;

            case 8: // grade was between 80 and 89
                ++bCount; // increment bCount
                break; // exit switch

            case 7: // grade was between 70 and 79
                ++cCount; // increment cCount
                break; // exit switch
            case 6: // grade was between 60 and 69
                ++dCount; // increment dCount
                break; // exit switch
            default: // grade was less than 60
                ++fCount; // increment fCount
                break; // optional; will exit switch anyway
        } // end switch

    }

    public void displayGradeReport()
    {
        System.out.println("\nGrade Report:");

        if(gradeCounter != 0)
        {
            double average = (double) total / gradeCounter;

            System.out.printf("Total of the %d grades entered is %d\n", gradeCounter, total);
            System.out.printf( "Class average is %.2f\n", average );
            System.out.printf( "%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n", "Number of students who received each grade:",
            "A: ", aCount,
            "B: ", bCount,
            "C: ", cCount,
            "D: ", dCount,
            "F: ", fCount );
        } // end if

        else
            System.out.println("end method displayGradeReport");
    }


}   // end class GradeBook


















