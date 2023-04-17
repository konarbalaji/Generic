package _12_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Hashmap_vs_Treemap_PerformanceCompare {

    public static void main(String[] args) {

        //O(logN)
        Map<Integer,Integer> map1 = new TreeMap<>();

        long now = System.currentTimeMillis();

        for(int i=0;i<500000;i++)
            map1.put(i,i);

        for(int i=0;i<500000;i++)
            map1.get(i);

        System.out.println("TIme taken with treemap : " + (System.currentTimeMillis()-now) +  " ms");

        //O(1)
        Map<Integer,Integer> map2 = new HashMap<>();

        now = System.currentTimeMillis();

        for(int i=0;i<500000;i++)
            map2.put(i,i);

        for(int i=0;i<500000;i++)
            map2.get(i);

        System.out.println("TIme taken with HashMap : " + (System.currentTimeMillis()-now) +  " ms");

    }


}
