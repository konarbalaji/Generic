package _10_Lists;

import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        //resizing the array takes O(N)
        List<String> names = new ArrayList<>(10);

        names.add("Kevin");
        names.add("Adam");
        names.add("Ana");

        //random indexing in O(1)
//        System.out.println(names.get(1));

        names.add(0,"Daniel");
        names.remove(0);

        //Contains will check whether the item is present in the array
        System.out.println(names.contains("Kevin"));

        Object[] o = names.toArray();

        //Arraylist (ARRAYS) are fast if we manipulate the last item

        //because of the Iterable interface
        for(Object s : names)
            System.out.println(s);
    }
}
