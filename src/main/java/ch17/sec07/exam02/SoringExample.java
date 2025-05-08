package ch17.sec07.exam02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SoringExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("홍길동", 30));
        students.add(new Student("유미선", 20));
        students.add(new Student("신용권", 10));

        students.stream().sorted(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getScore() - o2.getScore();
            }
        }).forEach(student -> {
            System.out.println(student.getName() + ": " + student.getScore());
        });

        System.out.println();
        students.stream().sorted(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getScore() - o1.getScore();
            }
        }).forEach(student -> {
            System.out.println(student.getName() + ": " + student.getScore());
        });
    }
}
