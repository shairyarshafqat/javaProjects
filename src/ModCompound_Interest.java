/**
 * Created by shairyarshafqat on 10/20/14.
 */
public class ModCompound_Interest {



        public static void main( String args[] )
        {
            double amount; // amount on deposit at end of each year
            double principal = 1000.0; // initial amount before interest
            double rate1 = 0.05; // interest rate
            double rate2 = 0.06; // interest rate
            double rate3 = 0.07; // interest rate
            double rate4 = 0.08; // interest rate
            double rate5 = 0.09; // interest rate
            double rate6 = 0.10; // interest rate


            // display headers
            System.out.printf( "%4s%20s%30s%40s%50s%60s%60s\n", "Year", "Amount on deposit 0.05", "Amount on deposit 0.06",
                    "Amount on deposit 0.07", "Amount on deposit 0.08", "Amount on deposit 0.09", "Amount on deposit 0.10" );

            // calculate amount on deposit for each of ten years
            for ( int year = 1; year <= 10; year++ )
            {
                // calculate new amount for specified year
                amount = principal * Math.pow( 1.0 + rate1, year );

                // display the year and the amount
                System.out.printf( "%4d%,20.2f\n", year, amount );
            } // end for
        } // end main
    } // end class Interest



