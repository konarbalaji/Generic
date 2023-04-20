package _14_SortingCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaComparatorApp {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Adam",33));
        people.add(new Person("Adam",34));
        people.add(new Person("Adam",25));
        people.add(new Person("Joe",12));
        people.add(new Person("Michael",25));
        people.add(new Person("Ana",27));
        people.add(new Person("Katy",78));
        people.add(new Person("Kavin",45));

        Collections.sort(people, Comparator.comparing(Person::getName).thenComparing(Person::getAge).reversed());

        for(Person p : people)
            System.out.println(p.getName() + "-" + p.getAge());

    }
}