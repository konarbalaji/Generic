package _18_Reflection;

import _17_StreamApi.Book;
import _17_StreamApi.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App4 {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Being and Time", "Heidegger", 560, Type.PHILOSOPHY));
        books.add(new Book("The Trial", "Franz Kafka", 240, Type.NOVEL));
        books.add(new Book("Death on The Nile", "Agatha Christie", 370, Type.THRILLER));
        books.add(new Book("Ancient Greece", "Robert F.", 435, Type.HISTORY));
        books.add(new Book("Ancient Rome", "Robert F.", 860, Type.HISTORY));
        books.add(new Book("Death of Virgil", "Hermann Broch", 590, Type.NOVEL));
        books.add(new Book("The Stranger", "Albert Camus", 560, Type.NOVEL));

        //Map & FlatMap are similar to selecting a column in SQL
        //Number of character in every word
        List<Integer> titleLengths = books.stream().map(x -> x.getTitle().length()).collect(Collectors.toList());

        //create a list containing squared numbers
        List<Integer> squauredNumbers = titleLengths.stream().map(x -> x*x).collect(Collectors.toList());
        squauredNumbers.forEach(System.out::println);

        String[] array = {"hello", "Shell"};
        Arrays.stream(array)
                .map(w -> w.split(""))
                .distinct()
                .collect(Collectors.toList()).forEach(System.out::println);

        List<String> unique = Arrays.stream(array)
                                    .map(w -> w.split(""))
                                    .flatMap(Arrays::stream)
                                    .distinct()
                                    .collect(Collectors.toList());

        unique.forEach(System.out::println);

    }
}