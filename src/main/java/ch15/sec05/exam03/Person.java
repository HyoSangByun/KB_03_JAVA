package ch15.sec05.exam03;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Person implements Comparable<Person> {
    public String name;
    public int age;

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }
}
