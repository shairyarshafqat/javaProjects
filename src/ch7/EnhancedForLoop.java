package us.shairyar.deiteljava.ch7;

/**
 * Created by shairyarshafqat on 12/18/14.
 */
public class EnhancedForLoop {

    public static void main(String[] args) {

        int [] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int total = 0;

        for(int number: array)
            total += number;

        System.out.printf("The total of the array(number) is %d. \n", total);

        int [] array2 = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int total2 = 0;

        for(int counter = 0; counter < array2.length; counter++)
            total2 += array2[counter];

        System.out.printf("the total of the array(counter) is %d.\n", total2);

        int [] array3 = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

        System.out.printf("%s%10s", "Index", "Value\n");

        for(int index = 0; index < array3.length; index++)
            System.out.printf("%4d%12d\n", index, array3[index]);
    }
}
