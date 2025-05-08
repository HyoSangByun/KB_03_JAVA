package ch17.exam01;

import java.util.ArrayList;
import java.util.List;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("김수영", "여", 87));
        totalList.add(new Student("김자바", "남", 95));
        totalList.add(new Student("오해영", "여", 93));

        /*List<Student> maleList = new ArrayList<>();
        for (Student s : totalList) {
            if (s.getSex().equals("남")) {
                maleList.add(s);
            }
        }*/

        List<Student> maleList = totalList.stream().filter(s -> s.getSex().equals("남")).toList();

        maleList.forEach(s -> System.out.println(s.getName()));

        System.out.println("==================");
        totalList.stream().sorted(((o1, o2) -> o2.getScore() - o1.getScore())).limit(2).forEach(s -> System.out.println(s.getName()));
    }
}
