package _18_Reflection;

import java.lang.reflect.Constructor;

public class ConstructorExampleApp  {

    public static void main(String[] args) throws Exception {

        Constructor<Test> cons = Test.class.getDeclaredConstructor();

        //we can instantiate a new class
        cons.setAccessible(true);
        Test test1 = cons.newInstance();
        Test test2 = cons.newInstance();
        Test test3 = cons.newInstance();
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);

    }



}

