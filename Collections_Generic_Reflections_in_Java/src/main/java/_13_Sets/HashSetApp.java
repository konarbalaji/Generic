package _13_Sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetApp {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();

        set1.add("Adam");
        set1.add("Mary");
        set1.add("Kary");
        set1.add("Ana");

        System.out.println("===============");
        Set<String> set2 = new HashSet<>();

        set2.add("Adam");
        set2.add("Ana");

        System.out.println(set1.containsAll(set2));
        set1.removeAll(set2);

        for(String s: set1)
            System.out.println(s);

    }
}
