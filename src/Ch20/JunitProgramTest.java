package us.shairyar.deiteljava.Ch20;

//import static org.ju nit.Assert.*;

public class JunitProgramTest {

    // this program runs and tests the square of a number
//    @org.junit.Test
    public void testSquare() throws Exception {

        JunitProgram test = new JunitProgram();

        int output = test.square(5);
//        assertEquals(25, output);
    }

    // this program runs and counts the letter 'A' in the word
//    @org.junit.Test
    public void testCountA() throws Exception {

        JunitProgram test = new JunitProgram();

        int output = test.countA("Apple");
//        assertEquals(1, output);
    }
}