package us.shairyar.deiteljava.ch7;

/**
 * Created by shairyarshafqat on 12/12/14.
 */
public class SumArray {

    public static void main(String[] args) {

        int [] Array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        int total = 0;

        for(int counter = 0; counter < Array.length; counter++)
            total += Array[counter];

        System.out.printf("Total elements of the array is: %d\n", total);



    }
}
