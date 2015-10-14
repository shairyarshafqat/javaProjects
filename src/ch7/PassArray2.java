package us.shairyar.deiteljava.ch7;

/**
 * Created by shairyarshafqat on 12/24/14.
 */
public class PassArray2 {

    public static void modifyArray(int [] array1)
    {
        for(int counter = 0; counter < array1.length; counter++)
           array1[counter] *= 2;
    }

    public static void modifyElememt(int element)
    {
        element *= 2;

        System.out.printf("The modified element is: %d\n", element);
    }


    public static void main(String[] args) {

        int [] array = {1,2,3,4,5};

        System.out.printf("Effects of passing reference to entire array:\n" +
                "The values of the original array are: \n");

        for(int vaule :array)
            System.out.printf("  %d", vaule);

        System.out.printf("\nEffects of passing reference to entire array:\n" +
                "The values of the modded array are: \n");

        modifyArray(array);
        for(int vaule :array)
            System.out.printf("  %d", vaule);
        System.out.println();

        System.out.printf("\nThe original array[3] element is: %d\n", array[3]);

        modifyElememt(array[3]);

        System.out.printf("The original array[3] element is: %d\n", array[3]);

    }
}

