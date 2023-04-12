package _01BasicGenerics;

public class GenericMethod {

    public <T,V> void printItems(T t, V v){
        System.out.println(t.toString());
        System.out.println(v.toString());
    }

    public <T> void showItems(T[] items){
        for(T t: items)
            System.out.println(t);
    }

    public <T> T showItem(T item){

        System.out.println("sout from GenMethid : " + item);
        return item;

    }

    public static void main(String[] args) {
        GenericMethod met = new GenericMethod();
        met.printItems("Adam",3);
        System.out.println("Item returned is : " + met.showItem("Balaji"));

        int[] nums = {1,2,3,4,5,6};
//        met.showItems(nums);

    }

}
