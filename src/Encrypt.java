/**
 * Created by shairyarshafqat on 10/8/14.
 */
import java.util.Scanner;

public class Encrypt {

    private int digit1;
    private int digit2;
    private int digit3;
    private int digit4;
    private int math;
    private int adding;
    private String swap;

//    public Encrypt() //int num1, int num2, int num3, int num4, int Math, int add, String swap)
//    {
//        this.digit1 = num1;
//        this.digit2 = num2;
//        this.digit3 = num3;
//        this.digit4 = num4;
//        this.math = Math;
//        this.adding = add;
//        this.swap = swap;

//    }

    public void setDigit1(int digit1)
    {
        this.digit1 = digit1;
    }

    public int getDigit1()
    {
        return digit1;
    }

    public void setDigit2(int digit2)
    {
        this.digit2 = digit2;
    }

    public int getDigit2()
    {
        return digit2;
    }

    public void setDigit3(int digit3)
    {
        this.digit3 = digit3;
    }

    public int getDigit3() {
        return digit3;
    }

    public void setDigit4(int digit4)
    {
        this.digit4 = digit4;
    }

    public int getDigit4()
    {
        return digit4;
    }

    public int math(int digit)
    {
        boolean done = false;
        this.digit1 = digit;
        this.digit2 = digit;
        this.digit3 = digit;
        this.digit4 = digit;

        Scanner input = new Scanner(System.in);

       while(!done)
        {
            System.out.println("Enter digit a digit 1: ");
            this.digit1 = input.nextInt();
            if(this.digit1 == -1)
                break;

            System.out.println("Enter digit a digit 2: ");
            this.digit2 = input.nextInt();

            System.out.println("Enter digit a digit 3: ");
            this.digit3 = input.nextInt();

            System.out.println("Enter digit a digit 4: ");
            this.digit4 = input.nextInt();

            this.adding = 7 + digit % 10;

            System.out.println(this.adding);



//            adding = digit + 7 % 10;
//            swap = Integer.toString(digit);
//            swap.charAt(digit = 1);
//            swap.toString(adding);


            //this.digit1 + this.digit2;





        }

        return math;


    }
}
// convert it to a string