package us.shairyar.deiteljava.Ch20;

/**
 * Created by shairyarshafqat on 3/5/15.
 */

import java.util.*;

public class Stacks {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        stack.push("Bottom");
        printStack(stack);

        stack.push("second");
        printStack(stack);

        stack.push("third");
        printStack(stack);

        stack.pop();
        printStack(stack);

        stack.pop();
        printStack(stack);

        stack.pop();
        printStack(stack);
    }

    public static void printStack(Stack<String> s)
    {
        if(s.isEmpty())
            System.out.println("You have an empty stack.");

        else
            System.out.printf("%s this is in the stack. \n", s);
    }
}
