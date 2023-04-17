package _12_Maps;

import java.util.Objects;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //hashcode = hash function


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        //hashcode = hash-function
        //It calculates an array index based on the key itself
        //avoid clustering with prime numbers

        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name==null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
