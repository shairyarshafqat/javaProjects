/**
 * Created by shairyarshafqat on 12/16/14.
 */
public class WhiteChocolate {

    public static void main(String[] args) {

        // a survey of 20 people, who will rate this new white chocolate brand on a scale of 1 to 5

        int response [] = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 1 ,2, 3, 3, 2, 2};
        int frequency []=new int [6];

        for(int counter = 1; counter < response.length; counter++)
        {
            try
            {
                ++frequency[response[counter]];
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);

                System.out.printf("     response[%d] = %d\n", counter, response[counter]);
            }
        }

        System.out.printf("%s%10s\n", "Rating", "Frequency");

        for(int rating = 1; rating < frequency.length; rating++)
            System.out.printf("%5d%10d\n", rating, frequency[rating]);
    }
}
