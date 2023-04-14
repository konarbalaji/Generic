package _02_BoundedTypeParameters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcardsApp {

    public static void sumAll(List<? extends Number> list){

        double sum = 0;
        for(Number n : list)
            sum += n.doubleValue();

        System.out.println(sum);

    }


    public static void showAll(List<? extends Number> list){

        for(Number n : list)
            System.out.println(n);
    }

    public static void main(String[] args) {

        //We can create ArrayList like this
        List<? extends Number> l1 = new ArrayList<Integer>();
        List<? extends Number> l2 = new ArrayList<Double>();
        List<? extends Number> l3 = new ArrayList<Float>();

        List<Integer> nums = new ArrayList<>();
        showAll(Arrays.asList(1.1,2.1,3.1));

        List<Number> numlist = Arrays.asList(1.1,2.1,3.1,5.2);
        sumAll(numlist);
    }
}