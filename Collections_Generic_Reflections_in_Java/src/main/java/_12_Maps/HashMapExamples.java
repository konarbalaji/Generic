package _12_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExamples {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        //insert into the map with O(1) if theer is no collision
        map.put(1,"Adam");
        map.put(2,"Kevin");
        map.put(3,"Ana");
        map.put(40,"Lucy");

        //remove items in O(1)
        map.remove(40);

        //we can retrive items based opn keys O(1)

        for(Integer key : map.keySet())
            System.out.println(key + " - " + map.get(key));

        for(Map.Entry<Integer, String> entry : map.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
    }
}