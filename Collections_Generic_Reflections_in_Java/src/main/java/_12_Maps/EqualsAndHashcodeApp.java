package _12_Maps;

import java.util.HashMap;
import java.util.Map;

public class EqualsAndHashcodeApp {

    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();

        map.put(new Person("Adam",25),"A");
    }
}
