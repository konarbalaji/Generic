package misc;

public class CountGreaterThan {

    public static void main(String[] args) {
        Integer[] intrarray = {1,2,3,4,5};
        String[] chararr = {"a", "b", "f", "d", "e"};
        int refvalue = 'c';
        String refstr = "b";

        int cnt = countGreaterItems(chararr,refstr);
        System.out.println("Greater than " + refvalue + " : " + cnt);
    }

    public static <T extends Comparable> Integer countGreaterItems(T[] items, T item){

        int count = 0;

        for(int i=0; i<items.length;i++){
            if(items[i].compareTo(item)>0)
                count++;
        }
        return count;
    }
}
