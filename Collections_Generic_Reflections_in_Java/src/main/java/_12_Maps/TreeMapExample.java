package _12_Maps;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {


        TreeMap<String,Integer> map =new TreeMap<>();

        map.put("Adam",10);
        map.put("Kevin",43);
        map.put("Ana",56);
        map.put("Daniel",21);
        map.put("Katy",10);

        System.out.println("Smallest Key : " + map.lastKey());
        System.out.println("Largest Key : " + map.firstKey());

        for(Map.Entry<String,Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());

    }
}