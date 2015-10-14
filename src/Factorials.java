/**
 * Created by shairyarshafqat on 10/19/14.
 */
public class Factorials {

    public static void main(String[] args) {

        int counter;
        long factorials = 1;
//        long total = 1;

        System.out.printf("%4s%30s\n", "Number", "Factorials");


        for(counter = 1; counter <= 20; counter++, factorials *= counter)
            System.out.printf("%4d%,30d\n", counter, factorials);

    }
}
//        while(counter <= 20)
//        {
////            factorials = counter * (counter - 1);
//            counter++;
//
//            System.out.printf("%4d%20d\n", counter,factorials);
//        }

// 2,432,902,008,176,640,000


