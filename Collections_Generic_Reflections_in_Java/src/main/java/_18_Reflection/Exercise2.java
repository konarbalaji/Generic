package _18_Reflection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise2 {

    public static void main(String[] args) {

        List<Integer> num1 = Arrays.asList(1,2,3);
        List<Integer> num2 = Arrays.asList(4,5);

        List<List<Integer>>  pairs = num1.stream()
                                        .flatMap(i -> num2.stream().map(j -> Arrays.asList(i,j)))
                                        .collect(Collectors.toList());

        System.out.println(pairs);

        var arr1 = new int[]{2,12,90};
        var arr2 = new int[]{13,7,1};

        Stream.of(arr1,arr2)
                .flatMapToInt(IntStream::of)
                .max()
                .ifPresent(System.out::println);


    }
}
