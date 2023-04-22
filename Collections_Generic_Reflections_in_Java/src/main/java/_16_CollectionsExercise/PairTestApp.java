package _16_CollectionsExercise;

public class PairTestApp {

    public static void main(String[] args) {

        Cache c = new Cache();

        c.search("www.google.com");
        c.search("www.facebook.com");
        c.search("www.cnn.com");
        c.search("www.bbc.com");
        c.search("www.google.com");
        c.search("www.abc.com");
        c.search("www.cbs.com");
        c.search("www.google.com");

        c.showCache();
    }
}