/**
 * Created by shairyarshafqat on 10/17/14.
 */
public class DoWhileTest {

    public static void main(String[] args) {

        /*The do...while statement tests the
        loop-continuation condition after executing the loop’s body; therefore,
        the body always executes at least once. */


        int counter = 1;
        do
        {
            System.out.printf("%d  ", counter);

            counter++;
        }
        while(counter <=10);
    }
}
