package us.shairyar.deiteljava.ch5;

/**
 * Created by shairyarshafqat on 10/28/14.
 */
public class TwelveDaysofChristmas {

    public static void main(String[] args) {

        // Write an application that uses repetition and switch statements to print the song “The Twelve Days of Christmas.”

        // initialize the song to null
        String result = "";

        // String days
        int day;

        for(day = 1 ; day <= 12; day++ )
        {
            result += "\nOn the ";

        // One switch statement should be used to print the day (“first,” “second,” and so on)

            switch(day)
            {
                case 1:
                    result += "first day ";
                    break;

                case 2:
                    result += "second day ";
                    break;

                case 3:
                    result += "third day ";
                    break;

                case 4:
                    result += "fourth day ";
                    break;

                case 5:
                    result += "fifth day ";
                    break;

                case 6:
                    result += "sixth day ";
                    break;

                case 7:
                    result += "seventh day ";
                    break;

                case 8:
                    result += "eight day ";
                    break;

                case 9:
                    result += "ninth day ";
                    break;

                case 10:
                    result += "tenth day ";
                    break;

                case 11:
                    result += "eleventh day ";
                    break;

                case 12:
                    result += "twelfth day ";
                    break;
                }

                result += "of Christmas\n" +
                        "My true love gave to me\n";

            switch(day)
            {
                case 12:
                    result += "Twelve lords-a-leaping, \n";

                case 11:
                    result += "Eleven pipers piping, \n";

                case 10:
                    result += "Ten drummers drumming, \n";

                case 9:
                    result += "Nine ladies dancing, \n";

                case 8:
                    result += "Eight maids-a-milking, \n";

                case 7:
                    result += "Seven swans-a-swimming, \n";

                case 6:
                    result += "Six geese-a-laying, \n";

                case 5:
                    result += "Five golden rings.\n";

                case 4:
                    result += "Four calling birds, \n";

                case 3:
                    result += "Three French hens, \n";

                case 2:
                    result += "Two turtle doves, and\n";

                case 1:
                    result += "a Partridge in a pear tree.\n";
            }

        }

        System.out.println(result);
    }
}


