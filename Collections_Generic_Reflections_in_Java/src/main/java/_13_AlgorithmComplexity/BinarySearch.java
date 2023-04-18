package _13_AlgorithmComplexity;

import java.math.BigDecimal;

public class BinarySearch {

    public static void main(String[] args) {
        int[] numbers = new int[1000000000];

        for(int i=0;i<numbers.length;i++)
            numbers[i]=i;

        long start = System.currentTimeMillis();
        int val = search(numbers, 5784);
        System.out.println("found : " + val);
        long end  = System.currentTimeMillis();
        System.out.println("Time taken : " + (end - start));

    }

    public static int search(int[] numbs, int item){

        int left =0;
        int right = numbs.length-1;

        int cnt=0;
        while (left<=right){
            System.out.println("Iteration number :  " + cnt++);

            int middle = (left+right)/2;

            if(numbs[middle] == item){
                return item;
            }

            else if(numbs[middle] < item)
                left=middle+1;
            else
                right = middle-1;

        }

        //number is missing in array
        return -1;

    }
}
