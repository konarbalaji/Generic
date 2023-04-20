package _13_Sets;

import com.sun.source.tree.Tree;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreesetApp {
    public static void main(String[] args) {

        //O(logN)
        SortedSet<Integer> set = new TreeSet<>();

        set.add(12);
        set.add(1);
        set.add(9);
        set.add(5);
        set.add(120);
        set.add(87);
        set.add(55);

        Set<Integer> subset = set.tailSet(50);

        for (Integer num : subset)
            System.out.println(num);

    }
}
