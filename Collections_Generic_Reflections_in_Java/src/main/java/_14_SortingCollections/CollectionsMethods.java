package _14_SortingCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsMethods {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(10);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(3);

        // we can reverse the order
        System.out.println(Collections.max(nums));
        System.out.println(Collections.min(nums));
        System.out.println(nums);
        Collections.rotate(nums,2);
        System.out.println(nums);
        Collections.shuffle(nums);
        System.out.println(nums);
        Collections.replaceAll(nums,1,10);
        System.out.println(nums);
    }
}