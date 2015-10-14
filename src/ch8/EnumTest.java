package us.shairyar.deiteljava.ch8;

/**
 * Created by shairyarshafqat on 3/21/15.
 */

// Fig. 8.11: EnumTest.java
// Testing enum type Book.
import java.util.EnumSet;

public class EnumTest
{
    public static void main( String args[] )
    {
        System.out.println( "All books:\n" );

        // print all books in enum Book
        for ( Book book : Book.values() )
            System.out.printf( "%-10s%-45s%s\n", book,
                    book.getTitle(), book.getCopyrightYear() );

        System.out.println( "\nDisplay a range of enum constants:\n" );

        // print first four books
        for ( Book book : EnumSet.range( Book.JHTP6, Book.CPPHTP4 ) )
            System.out.printf( "%-10s%-45s%s\n", book,
                    book.getTitle(), book.getCopyrightYear() );
        //
        System.out.println();
        System.out.println("New loop created by me.");
        System.out.println();

        for(Book book : EnumSet.range(Book.VBHTP2, Book.shairyar))
            System.out.printf( "%-10s%-45s%s\n", book,
                    book.getTitle(), book.getCopyrightYear() );
    } // end main
} // end class EnumTest

