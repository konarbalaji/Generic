package _10_Lists;

import java.util.ArrayList;
import java.util.LinkedList;

public class Arraylist_VS_Linkedlist_Performance {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();

        long now = System.currentTimeMillis();

        for(int i=0; i<500000; i++)
            array.add(0,i);

        System.out.println("Time taken for arraylist : " + (System.currentTimeMillis()-now));

        LinkedList<Integer> list = new LinkedList<>();

        now = System.currentTimeMillis();

        for(int i=0; i<500000; i++)
            list.addFirst(i);

        System.out.println("Time taken for LinkedList : " + (System.currentTimeMillis()-now));




    }


}
