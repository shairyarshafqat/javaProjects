package us.shairyar.deiteljava.Ch20;

/**
 * Created by shairyarshafqat on 3/10/15.
 */
public class JunitProgram {

    public int square(int x)
    {
        return x*x;
    }

    public int countA(String word)
    {
        int count = 0;
        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) == 'a' || word.charAt(i) == 'A')
            {
                count++;
            }

        }
        return count;
    }
}
