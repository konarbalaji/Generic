package _04_BoundedTypeParameters;


class Person implements Comparable<Person> {

    private int age;
    private String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age,o.getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


public class CalculateMinApp {

    public static void main(String[] args) {

        System.out.println(calculateMin(10.1,202.0));
        System.out.println(calculateMin(new Person("Adam",50),new Person("Eve",42)));
    }

    public static <T extends Comparable> T calculateMin(T num1, T num2){

        if(num1.compareTo(num2) > 0)
            return num2;
        else return num1;

    }
}
