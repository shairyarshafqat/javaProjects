/**
 * Created by shairyarshafqat on 10/15/14.
 */
public class ForCounter {

    public static void main(String[] args) {

        // positive counter
        for(int counter = 1; counter <= 10; counter++)
            System.out.printf("%d  ",counter);

        System.out.println();

        // negative counter
        for(int counter = 10; counter >= 1; counter--)
            System.out.printf("%d  ", counter);

        System.out.println();


        // Vary the control variable from 7 to 77 in increments of 7.
        for ( int i = 7; i <= 77; i += 7 )
            System.out.printf("%d  ", i);

        System.out.println();

        // Vary the control variable from 20 to 2 in decrements of 2.
        for ( int i = 20; i >= 2; i -= 2 )
            System.out.printf("%d  ", i);

        System.out.println();

        // Vary the control variable over the values 2, 5, 8, 11, 14, 17, 20.
        for ( int i = 2; i <= 20; i += 3 )
            System.out.printf("%d  ", i);

        System.out.println();

        // Vary the control variable over the values 99, 88, 77, 66, 55, 44, 33, 22, 11, 0.
        for ( int i = 99; i >= 0; i -= 11)
            System.out.printf("%d  ", i);














    }
}
