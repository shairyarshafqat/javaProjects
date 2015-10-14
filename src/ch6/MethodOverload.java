package us.shairyar.deiteljava.ch6;

/**
 * Created by shairyarshafqat on 11/5/14.
 */
public class MethodOverload {
    // Fig. 6.13: MethodOverload.java
// Overloaded method declarations.

        // test overloaded square methods
        public void testOverloadedMethods()
        {
            System.out.printf( "Square of integer 7 is %d\n", square( 7 ) );
            System.out.printf( "Square of double 7.5 is %f\n", square( 7.5 ) );
        } // end method testOverloadedMethods

        // square method with int argument
        public int square( int intValue )
        {
            System.out.printf( "\nCalled square with int argument: %d\n",
                    intValue );
            return intValue * intValue;
        } // end method square with int argument

        // square method with double argument
        public double square( double doubleValue )
        {
            System.out.printf( "\nCalled square with double argument: %f\n",
                    doubleValue );
            return doubleValue * doubleValue;

        } // end method square with double argument

    public static void main( String args[] )
    {
        MethodOverload methodOverload = new MethodOverload();
        methodOverload.testOverloadedMethods();
    } // end main
} // end class MethodOverloadTest


