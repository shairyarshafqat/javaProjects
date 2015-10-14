package us.shairyar.deiteljava.ch7;

/**
 * Created by shairyarshafqat on 12/11/14.
 */
public class InitArray {


    public static void main(String[] args) {

        // array example 1 starts
        int array [];
        array = new int [10];

//        array = {0,1,2,3,4,5,6,7,8,9};

        System.out.printf("%s%8s\n", "Index", "Value");

        for(int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d\n", counter, array[counter]);

        System.out.println();
        // array example 1 ends

        // array example 2(array-initializer) starts

        int arrayI [] = {0,10,20,30,40,50,60,70,80,90,};

        System.out.printf("%s%8s\n", "Index", "Value");

        for(int i = 0; i < arrayI.length; i++)
            System.out.printf("%5d%8d\n", i, arrayI[i]);

        System.out.println();
        // array example 2 ends

        // calculating arrays example starts

        final int ARRAY_LENGTH = 10;

        int []arrayA = new int[ARRAY_LENGTH];
        for(int counter =0; counter < arrayA.length; counter++)
            arrayA[counter] = 2 + 2 * counter;

        System.out.printf("%s%8s\n", "Index", "Value");

        for(int counter = 0; counter < arrayA.length; counter++)
            System.out.printf("%5d%8d\n", counter, arrayA[counter]);

        System.out.println();
        // calculating array example ends

    }
}

