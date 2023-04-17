package _12_Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapApp {

    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("aaa",1);
        map.put("bbb",2);
        map.put("ccc",3);
        map.put("ddd",4);
        map.put("eee",5);
        map.put("fff",6);
        map.put("ggg",7);
        map.put("hhh",8);
        map.put("iii",9);
        map.put("jjj",10);

        for (String s : map.keySet())
            System.out.println(s + " - " + map.get(s));


    }
}
