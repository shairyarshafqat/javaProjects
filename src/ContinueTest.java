/**
 * Created by shairyarshafqat on 10/18/14.
 */
public class ContinueTest {

    /*skips the remaining statements in the loop body and
    proceeds with the next iteration of the loop*/

    public static void main(String[] args) {

        int count;

        for(count = 1; count <= 10; count++)
        {

            if(count == 5)
                continue;
            System.out.printf("%d  ", count);
        }

//        System.out.println("\nmissing number " + count);

    }
}
