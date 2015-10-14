package Java_Questions.DerekBanasTutorial;

/**
 * Created by shairyarshafqat on 3/24/15.
 */
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {

        String word;
        String pal = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word to check if Palindrome: ");
        word = input.nextLine();

//        word = "aaaa";

        int len = word.length();

        for(int i = len - 1; i >= 0; i-- )
            pal += word.charAt(i);

        if(word.equals(pal))
            System.out.printf("The word you (%s) entered is a palindrome.\n", word);

        else
            System.out.printf("The word you (%s) entered isn't a palindrome.\n", word);



    }

}
