package _10_Lists;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ArrayDQ_VS_Stack_Performance {

    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();

        long now = System.currentTimeMillis();

        for(int i=0; i<500000; i++)
            stack.push(i);

        while (!stack.isEmpty())
            stack.pop();

        System.out.println("Time taken with ArrayDeque : " + (System.currentTimeMillis()-now) + " ms");

        Stack<Integer> stack2 = new Stack<>();

        long now1 = System.currentTimeMillis();

        for(int i=0; i<500000; i++)
            stack2.push(i);

        while (!stack.isEmpty())
            stack.pop();

        System.out.println("Time taken with ArrayDeque : " + (System.currentTimeMillis()-now1) + " ms");

    }
}
