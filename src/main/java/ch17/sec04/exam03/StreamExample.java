package ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
    public static int sum;

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).forEach(i -> sum += i);
        System.out.println("총합 : " + sum);
    }
}
