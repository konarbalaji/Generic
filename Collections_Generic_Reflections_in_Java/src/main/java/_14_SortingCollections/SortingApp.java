package _14_SortingCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingApp {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("Albert Camus","title1",223));
        books.add(new Book("Z","title3",33));
        books.add(new Book("Heidegger","Being and Time",891));
        books.add(new Book("Michi Kaku", "Quantum Physics",34));

        Collections.sort(books, new BookComparator());

        System.out.println(books);

    }


}
