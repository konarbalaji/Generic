package _17_StreamApi;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamWithNames {

    public static void main(String[] args) {
        String[] names = {"Adam","Daniel","Martha","Kevin","Ben","Joe","Brad","Susan"};

        /*Stream.of(names)
                .sorted(Comparator.reverseOrder())
                .forEach(x -> System.out.println(x));*/

        Stream.of(names)
                .filter(x -> x.startsWith("B"))
                .forEach(System.out::println);
    }
}