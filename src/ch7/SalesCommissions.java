package us.shairyar.deiteljava.ch7;

/**
 * Created by shairyarshafqat on 12/24/14.
 */
public class SalesCommissions {

//  Use a one-dimensional array to solve the following problem:
//  A company pays its salespeople on a commission basis.
//  The salespeople receive $200 per week plus 9% of their gross sales for that week.
//  For example, a salesperson who grosses $5000 in sales in a week receives $200 plus 9% of $5000, or a total of $650.
//  Write an application (using an array of counters)that determines how many of the salespeople earned salaries in each
//  of the following ranges (assume that each salesperson’s salary is truncated to an integer amount):

//    a) $200–299
//    b) $300–399
//    c) $400–499
//    d) $500–599
//    e) $600–699
//    f) $700–799
//    g) $800–899
//    h) $900–999
//    i) $1000 and over

//  Summarize the results in tabular format.

    public static void main(String[] args) {

        // create an array with all the items cost
        int sum =0;
        int salary = 200;
        int commission = 9;


        int [] array = {500,400,200,350,5000};
        int [] freq = new int [6];

        System.out.printf("%s%20s\n\n", "Range","Sales Person");

        // for-loop to print out range
        for(int counter = 2; counter < 11; counter++)
        {
            if (counter == 10)
                System.out.printf("%d %s: \n", 1000 , "and over" );

            else
                System.out.printf("%d-%d: \n", counter * 100, counter * 100 + 99);
        }


        // each sales man receives $200 per week and 9% of whatever the products cost
        for(int counter = 0; counter < array.length; counter++) {
            sum = 200 + 9 * array[counter] / 100;
            ++freq[array[counter]];
        }


        for(int value = 0; value < freq.length; value++)
            System.out.printf("%50d\n", freq[value]);


    }
}