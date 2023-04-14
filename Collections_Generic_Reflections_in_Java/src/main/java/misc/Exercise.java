package misc;

import java.math.BigDecimal;

public class Exercise {

    // here you have to implement a generic method to add 2 numbers and return the result
    // name of the method must be add(num1, num2) - with 2 arguments num1 and num2 !!!

    public static void main(String[] args){
        System.out.println(add(10.5,20));
    }

    public static <T extends Number> Number add(T num1, T num2){
        return num1.doubleValue()+num2.doubleValue();
    }
}