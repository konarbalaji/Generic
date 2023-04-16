package _10_Lists;

import java.util.LinkedList;

public class LinkedListApp {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);

        for (Integer num : list)
            System.out.println(num);
    }
}