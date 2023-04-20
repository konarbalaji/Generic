package _14_SortingCollections;

import java.util.*;

public class CollectionSortApp {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Adam");
        list.add("Joe");
        list.add("Katy");
        list.add("Ana");

        Collections.sort(list,Collections.reverseOrder());

//        System.out.println(list);

        List<Integer> list1 = new LinkedList<>();

        list1.add(10);
        list1.add(5);
        list1.add(2);
        list1.add(20);

        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);

    }
}