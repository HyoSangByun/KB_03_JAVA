package ch15.sec05.exam04;

import java.util.*;

public class ComparatorExample2 {
    public static void main(String[] args) {
        TreeSet<Fruit> fruits = new TreeSet<>(new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                return o1.price - o2.price;
            }
        });
        
        fruits.add(new Fruit("포도", 3000));
        fruits.add(new Fruit("수박", 10000));
        fruits.add(new Fruit("딸기", 6000));

        for (Fruit fruit : fruits) {
            System.out.println(fruit.name + " " + fruit.price);
        }
    }
}
