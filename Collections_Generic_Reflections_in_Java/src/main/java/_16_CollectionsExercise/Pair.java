package _16_CollectionsExercise;

public class Pair {
    private String url;
    private String data;

    public Pair(String url, String data) {
        this.url = url;
        this.data = data;
    }

    public String getUrl() {
        return url;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Pair[" + "url='" + url + " - data='" + data + ']';
    }
}
