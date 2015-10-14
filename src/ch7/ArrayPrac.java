package us.shairyar.deiteljava.ch7;

/**
 * Created by shairyarshafqat on 12/10/14.
 */
public class ArrayPrac {

    public static void array()
    {
        int shairyar[] = new int[10];

        shairyar[0] = 10;
        shairyar[1] = 11;
        shairyar[2] = 12;
        shairyar[3] = 13;
        shairyar[4] = 14;
        shairyar[5] = 15;
        shairyar[6] = 16;
        shairyar[7] = 17;
        shairyar[8] = 18;
        shairyar[9] = 19;

        System.out.println(shairyar[4]);

        // adding an array
        int sum = shairyar[4] + shairyar[0] - 4;
        System.out.println(sum);
    }

    public static void array2()
    {
        // declaring an array shairyar
        int shairyar[] = {0,1,2,3,4,5,6,7,8,9};

        // declaring an array ha
        int ha[] = {0,1,2,3,4};

        // printing out array shairyar
        System.out.println(shairyar[7]);

        // printing out array ha
        System.out.println(ha[1]);

        // dividing an array
        int sum = shairyar[9] / 3;
        System.out.println(sum);
    }

    public static void array3()
    {


    }



    public static void main(String[] args) {
        ArrayPrac.array();

        ArrayPrac.array2();

//        int[][] b = { { 1, 2 }, { 3, 4, 5 } };
//        System.out.printf("%d \n", b);
    }
}
