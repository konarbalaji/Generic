package _14_SortingCollections;

import java.util.Comparator;

    //public class Book implements Comparable<Book> {
    public class Book {

    private String authorName;
    private String title;
    private int numOfPages;

    public Book() {
    }

    public Book(String authorName, String title, int numOfPages) {
        this.authorName = authorName;
        this.title = title;
        this.numOfPages = numOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    @Override
    public String toString() {
        //return "Book[" + " authorName='" + authorName + ", title='" + title + ", numOfPages=" + numOfPages +']';
        return authorName + "-" + title + "-" + numOfPages;
    }

    /*@Override
    public int compareTo(Book o) {

        return this.getAuthorName().compareTo(o.getAuthorName());
        //return Integer.valueOf(this.getNumOfPages()).compareTo(Integer.valueOf(o.getNumOfPages()));
        //return this.getTitle().compareTo(o.getTitle());
        //return Integer.compare(this.getNumOfPages(),o.getNumOfPages());

    }*/
}