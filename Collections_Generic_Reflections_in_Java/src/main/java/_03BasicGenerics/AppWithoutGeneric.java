package _03BasicGenerics;

class Store{

    Object item;

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}

public class AppWithoutGeneric {

    public static void main(String[] args) {
        Store store = new Store();
        store.setItem(45.4);
        //we can cast object into any other object
        Double item = (Double)store.getItem();
        System.out.println(item);
    }
}