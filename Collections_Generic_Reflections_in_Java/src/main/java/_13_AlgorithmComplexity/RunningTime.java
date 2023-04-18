package _13_AlgorithmComplexity;

public class RunningTime {

    public static void main(String[] args) {
        int[] numbers = new int[10000000];

        for(int i=0;i<numbers.length;i++)
            numbers[i]=i;

        long start = System.currentTimeMillis();

        getFirst(numbers);

        System.out.println("Time taken : " + (System.currentTimeMillis()-start));

    }

    public static int getFirst(int[] nums){
        return nums[0];
    }
}