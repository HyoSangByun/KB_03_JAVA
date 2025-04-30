package ch15.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("================");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
