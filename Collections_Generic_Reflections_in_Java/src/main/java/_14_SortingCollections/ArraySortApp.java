package _14_SortingCollections;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortApp {
    public static void main(String[] args) {

        //QuickSort - to sort primitive types(int, float, etc)
        //MergeSort - to sort referenve types

        int[] nums = {1, 10 , 5 , 2 , -5 , 12 , 14 , 0 , 1 , 2 };
        String[] names = {"Kevin","Daniel","Kay","Ana","Joe","Adam"};

        Arrays.sort(names);

        for (String n : names)
            System.out.println(n);

        System.out.println("====================");

        for(int i= names.length-1; i>=0; i--)
            System.out.println(names[i]);


    }
}
