package _17_StreamApi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Exercise {

    public static void main(String[] args) {
        filterBooks();
    }

    public static void filterBooks() {

        // we have the dataset
        List<Book> books = new ArrayList<>();
        books.add(new Book("Being and Time", "Heidegger", 560, Type.PHILOSOPHY));
        books.add(new Book("The Trial", "Franz Kafka", 240, Type.NOVEL));
        books.add(new Book("Death on The Nile", "Agatha Christie", 370, Type.THRILLER));
        books.add(new Book("Ancient Greece", "Robert F.", 435, Type.HISTORY));
        books.add(new Book("Ancient Rome", "Robert F.", 860, Type.HISTORY));
        books.add(new Book("Death of Virgil", "Hermann Broch", 590, Type.NOVEL));
        books.add(new Book("The Stranger", "Albert Camus", 560, Type.NOVEL));

        // here you have to filter these books - and return the result
        books.stream()
                .filter(x -> x.getTitle().split(" ").length == 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}

class Book1 {

    private String author;
    private String title;
    private int pages;
    private Type type;

    public Book1(String title, String author, int pages, Type type) {
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", title=" + title + ", pages=" + pages + ", type=" + type + "]";
    }
}

enum Type1 {
    NOVEL, FICTION, HISTORY, THRILLER, PHILOSOPHY;
}