package _05_TypeInference;

import java.util.ArrayList;
import java.util.List;

public class TypeInference {

    public static void main(String[] args) {
        List<Integer> list1 = add(new ArrayList<>(), 10,20);
        System.out.println(list1);

        List<Character> list2 = add(new ArrayList<>(), 'a','b');
        System.out.println(list2);
    }

    public static <T> List<T> add(List<T> list, T a, T b){
        list.add(a);
        list.add(b);
        return list;
    }
}
