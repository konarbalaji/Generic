package _01BasicGenerics;

import java.util.Objects;

public class App {

    public static void main(String[] args) {
        add(1,2);
        add(1.1,2.1);
    }

    //Add Integer
    public static void add(int n1, int n2){
        int result = n1+n2;
        System.out.println(result);
    }

    //Overloaded with Double - needs add method for every type
    public static void add(Double n1, Double n2){
        Double result = n1+n2;
        System.out.println(result);
    }
}