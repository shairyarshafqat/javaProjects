package us.shairyar.deiteljava.ch6;

import java.util.Arrays;

/**
 * Created by shairyarshafqat on 3/4/15.
 */
public class TheStack {

    private String[] stackArray;

    private int stackSize;

    private int topOfStack = -1;

    TheStack(int size)
    {
        stackSize = size;

        stackArray = new String[size];

        Arrays.fill(stackArray, "-1");

    }

    public void push(String input)
    {
        if(topOfStack + 1 < stackSize)
        {
            topOfStack++;

            stackArray[topOfStack] = input;

        }

        else System.out.println("Sorry but the Stack is full. ");

        //

        System.out.println("PUSH " + input + " Was added to the Stack");
    }

    public String pop()
    {
        if(topOfStack >= 0)
        {

        }
        return "empty array";
    }
}
