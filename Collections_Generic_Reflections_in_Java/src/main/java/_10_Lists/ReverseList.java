package _10_Lists;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(Integer.valueOf(1));
        nums.add(Integer.valueOf(2));
        nums.add(Integer.valueOf(3));
        nums.add(Integer.valueOf(4));
        nums.add(Integer.valueOf(5));
        nums.add(Integer.valueOf(6));
        nums.add(Integer.valueOf(7));
        nums.add(Integer.valueOf(8));
        nums.add(Integer.valueOf(9));

        System.out.println(nums);
        reverse(nums);
        System.out.println(nums);

    }

    public static void reverse(List<Integer> list) {
        for(int i=0, mid=list.size()/2, j=list.size()-1;i<mid;i++,j--) {
            int num1 = list.get(i);
            int num2 = list.get(j);
            list.set(i, num2);
            list.set(j, num1);
        }
    }
}

