package us.shairyar.deiteljava.ch7;

/**
 * Created by shairyarshafqat on 12/24/14.
 */
public class GradeBook2 {

    public static void GradeArray(int [] gradeArray)
    {
        System.out.printf("The grades are: \n\n");

        for(int counter = 0; counter < gradeArray.length; counter++)
            System.out.printf("Student  %d:   %d\n", counter, gradeArray[counter]);
    }


    public static void main(String[] args) {

        int [] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        int [] frequency = new int [10];

        System.out.printf("Welcome to the grade book for\n" +
                "CS101 Introduction to Java Programming!\n\n");

        GradeArray(array);

    }
}
