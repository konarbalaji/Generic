package _18_Reflection;

public class Person {

    public String name;
    public int age;

    public static void main(String[] args) {
        Class<Person> personClass = Person.class;
        System.out.println(personClass.getPackage().getName());
    }

}