package _18_Reflection;

import java.io.Serializable;
import java.lang.annotation.*;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection1 {

    public static void main(String[] args) {

        Class per = Person1.class;

        Method[] met = per.getDeclaredMethods();

        int i=0;
        for (Method m : met){
            m.setAccessible(true);
            //System.out.println(++i + "-" + m.getName() + "-" +  m.getReturnType());
            if(m.isAnnotationPresent(MyAnnotation.class))
                System.out.println("Ann present on " + m.getName());
        }

        Class[] interfaces = per.getInterfaces();

        for(Class c : interfaces){
            //System.out.println(c.getName());
        }

       AnnotatedType[] anns = per.getAnnotatedInterfaces();
        for (AnnotatedType a : anns)
            System.out.println(" Hello " + a.getAnnotations().toString());



        /*Field[] fields = per.getDeclaredFields();

        for (Field f : fields) {
            f.setAccessible(true);
            System.out.println(f.getName());
        }*/
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation{
    public String name();
}

class Person1 implements Comparable<Person>, Serializable {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @MyAnnotation(name = "myann")
    private String returnName(){
        return this.name + " is the name";
    }

    @Override
    public String toString() {
        return "Person1[ name='" + name + ", age=" + age + ']';
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}