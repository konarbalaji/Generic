package _06_Wildcards;

import java.util.Arrays;
import java.util.List;

public class WildCard {

    public static void print(List<?> list){
        for(Object o: list)
            System.out.println(o);
    }


    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4);
        List<String> strs = Arrays.asList("a","b","c","d");
        print(nums);
        print(strs);

    }
}