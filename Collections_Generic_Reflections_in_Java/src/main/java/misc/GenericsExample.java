package misc;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(31);
        intList.add(332);
        printList(intList);

        List<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");
        printList(strList);

    }

    private static void printList(List<?> myList){
        System.out.println(myList);

    }
}
