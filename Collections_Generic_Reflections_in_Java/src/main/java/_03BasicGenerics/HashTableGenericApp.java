package _03BasicGenerics;

class Hashtable<K, V> {

    private K key;
    private V value;

    public Hashtable(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Hashtable [key=" + key +", value=" + value +']';
    }
}

public class HashTableGenericApp {

    public static void main(String[] args) {

        Hashtable<String,Integer> item = new Hashtable<>("A",1);
        //we can cast object into any other object
        System.out.println(item);
    }
}