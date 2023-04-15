package _06_Wildcards;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildCardApp {

    public static void showAll(List<? super Number> list){

        for(Object n : list)
            System.out.println(n);
    }

    public static void main(String[] args) {
        List<? super Integer> l1 = new ArrayList<Integer>();
        List<? super Integer> l2 = new ArrayList<Number>();
        List<? super Integer> l3 = new ArrayList<Object>();

        //How to read items using lower bounded wildcard
        List<Serializable> list = new ArrayList<>();
        list.add("Adam");
        list.add("Eve");
        list.add("Moses");
        showAll(list);

        //insert items
        List<? super Number> nums = new ArrayList<>();
        nums.add(3);
        nums.add(3.3);
        nums.add(3.5f);
        showAll(nums);

    }
}
