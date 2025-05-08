package ch17.sec06.exam02;

import java.util.Arrays;

public class MapExample {
    public static void main(String[] args) {
        int[] intArrary = {1, 2, 3, 4, 5};

        Arrays.stream(intArrary).mapToDouble(i -> (double)i).forEach(System.out::println);
        System.out.println();
        Arrays.stream(intArrary).forEach(System.out::println);
    }
}
