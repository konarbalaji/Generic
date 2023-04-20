package _13_Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetApp {

    public static void main(String[] args) {

        //LinkedhashSet maintains insertion order
        Set<String> set = new LinkedHashSet<>();

        set.add("Adam");
        set.add("Kevin");
        set.add("Daniel");
        set.add("Joe");
        set.add("Ana");

        for(String s : set)
            System.out.println(s);
    }
}
