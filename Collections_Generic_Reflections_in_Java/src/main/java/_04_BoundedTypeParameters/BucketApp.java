package _04_BoundedTypeParameters;


import java.util.ArrayList;
import java.util.List;

public class BucketApp{


    public static void main(String[] args) {
        List<Bucket<String>> list = new ArrayList<>();
        List<Bucket<Integer>> intlist = new ArrayList<>();
        BucketApp.addStore("Adam",list);
        BucketApp.addStore(1,intlist);
    }

    public static <T> void addStore(T t, List<Bucket<T>> list){
        Bucket<T> bucket = new Bucket<>();
        bucket.setItem(t);
        list.add(bucket);
        System.out.println(t.toString() + " has been added to the list ... ");
    }

}


class Bucket<T> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}


