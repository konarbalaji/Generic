package _15_CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollectionsList {

    public static void main(String[] args) {


        List<Integer> nums = Collections.synchronizedList(new ArrayList<>());

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<1000; i++)
                    nums.add(i);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<1000; i++)
                    nums.add(i);
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<1000; i++)
                    nums.add(i);
            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<1000; i++)
                    nums.add(i);
            }
        });

        Thread t5 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<1000; i++)
                    nums.add(i);
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Size of Array : " + nums.size());

    }
}
