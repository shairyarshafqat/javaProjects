package us.shairyar.deiteljava.ch7;

/**
 * Created by shairyarshafqat on 12/17/14.
 */
public class DeckOfCardsTest {

    // execute application
    public static void main( String args[] )
    {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // place Cards in random order

        // print all 52 Cards in the order in which they are dealt
        for ( int i = 0; i < 13; i++ )
        {
            // deal and print 4 Cards
            System.out.printf( "%-20s%-20s%-20s%-20s\n",
                    myDeckOfCards.dealCard(), myDeckOfCards.dealCard(),
                    myDeckOfCards.dealCard(), myDeckOfCards.dealCard() );
        } // end for
    } // end main
} // end class DeckOfCardsTest

