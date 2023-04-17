package _11_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueApp {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.offer("Adam");
        queue.offer("Kevin");
        queue.offer("Ana");
        queue.offer("Katy");

        System.out.println("Removing Item : " + queue.element());

        for(String s: queue)
            System.out.println(s);

        while (!queue.isEmpty())
            System.out.println("Removing : " + queue.remove());
    }
}