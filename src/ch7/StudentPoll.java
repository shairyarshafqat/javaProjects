package us.shairyar.deiteljava.ch7;

/**
 * Created by shairyarshafqat on 12/13/14.
 */
public class StudentPoll {

    public static void main(String[] args) {

        // Twenty students were asked to rate on a scale of 1 to 5 the quality of the food in the student
        // cafeteria, with 1 being “awful” and 5 being “excellent.”
        // Place the 20 responses in an integer array and determine the frequency of each rating.

        int []response = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 1 ,2, 3, 3, 2, 14};

        int [] frequency = new int[6];


        for(int counter = 0; counter < response.length; counter++)
        {
            try
            {
                ++frequency[response[counter]];
            }
            catch (ArrayIndexOutOfBoundsException exception)
            {
                System.out.println(exception);
                System.out.printf("     response[%d] = %d\n\n", counter, response[counter]);
            }
        }

        System.out.printf("%s%10s\n","Rating", "Frequency");

        for(int rating = 1; rating < frequency.length; rating++)
            System.out.printf("%6d%10d\n", rating, frequency[rating]);











    }
}
