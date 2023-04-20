package _18_Reflection;

public class ReflectionExampleApp {

    public static void main(String[] args) {

        //First method to acquire the class
        Class<Person> c = Person.class;
        System.out.println(c.getName());

        //second approach
        Class personclass = null;
        try {
            personclass = Class.forName("_18_Reflection.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(personclass.getName());

    }
}
