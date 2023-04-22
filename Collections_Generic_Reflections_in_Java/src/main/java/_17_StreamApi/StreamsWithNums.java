package _17_StreamApi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.IntStream;

public class StreamsWithNums {

    public static void main(String[] args) {
        int[] arr = {1,-8,6,4,-8,-7,-5,10,58};

        //Lambda Expression
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);

        IntStream.range(0,50)
                .filter(x -> (x%2!=0))
                .forEach(x -> System.out.print(x + " "));
    }

}
