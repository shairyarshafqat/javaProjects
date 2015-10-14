package us.shairyar.deiteljava.ch6;

/**
 * Created by shairyarshafqat on 11/14/14.
 */
public class TempConv {

    static void Celsius(int tmp)
    {
        int f = 0;
        double c =  5.0 / 9.0 * ( f - 32 );

        tmp = (int) c;

        System.out.println("C "+tmp);
    }

    static void Fahrenheit(int tmp)
    {
        int c = 0;
        double f = 9.0 / 5.0 * c + 32;

        tmp = (int) f;

        System.out.println("F "+tmp);
    }

    public static void main(String[] args) {

        Celsius(0);

        Fahrenheit(32);
    }




}

