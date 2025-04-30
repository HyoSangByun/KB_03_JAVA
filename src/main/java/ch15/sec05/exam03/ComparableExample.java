package ch15.sec05.exam03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("홍길동", 35));
        people.add(new Person("김자바", 25));
        people.add(new Person("박지원", 31));

        Collections.sort(people);
        for (Person person : people) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}
