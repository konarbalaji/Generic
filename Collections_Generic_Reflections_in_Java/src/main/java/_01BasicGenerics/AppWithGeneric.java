package _01BasicGenerics;

class StoreGeneric<T> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}



public class AppWithGeneric {

    public static void main(String[] args) {
        StoreGeneric<String> store = new StoreGeneric();
        store.setItem("Hello");
        //we can cast object into any other object
        String item = store.getItem();
        System.out.println(item);
    }
}