package ch16.exam3;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefTest {
    public static void main(String[] args) {

        // 정적 메서드 참조 - 절댓값 구하기

        // 1) 익명 클래스
        Function<Integer, Integer> abs1 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return Math.abs(integer); //static 메서드
            }
        };
        System.out.println("abs1.apply(-1) = " + abs1.apply(-1));

        // 2) 람다식으로 변경
        Function<Integer, Integer> abs2 = (s) -> Math.abs(s);
        System.out.println("abs2.apply(-2) = " + abs2.apply(-2));

        // 정적 메서드 참조로 변경
        // int Math.abs(integer) : 정수를 1개 전달 받아 정수 1개 반환
        Function<Integer, Integer> abs3 = Math::abs;

        System.out.println("abs3.apply(-3) = " + abs3.apply(-3));

        //인스턴스 메서드 참조 - 문자열 소문자로 변경하기
        String str = "Hello World";

        // 1) 익명 클래스
        Supplier<String> lower1 = new Supplier<String>() {
            @Override
            public String get() {
                return str.toLowerCase();
            }
        };
        System.out.println("lower1 = " + lower1.get().toString());

        // 2) 람다식으로 변경
        Supplier<String> lower2 = () -> str.toLowerCase();
        System.out.println("lower2 = " + lower2.get().toString());

        // 3)인스턴스 메서드 참조로 변경
        Supplier<String> lower3 = str::toLowerCase;
        System.out.println("lower3 = " + lower3.get().toString());

        // 특정 타입의 인스턴스 메서드 참조
        // 인스턴스 고정 X
        // 같은 타입이 매개변수로 전달되어 오면
        // 해당 타입의 공통된 메서드를 참조해서 수행

        // 람다식 : (String s) -> s.length()
        // 람다식 : String::length
        Function<String, Integer> strLength = String::length;
        System.out.println("strLength.apply(\"hello\") = " + strLength.apply("hello"));

        // List 순차 접근 후 출력
        List<String> nameList = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee");

        nameList.forEach(item -> System.out.println(item));
        System.out.println("--------------------------");
        nameList.forEach(System.out::println);
        // System.out == PrintStream 타입 객체
        // println == void println(String str) 형태의 PrintStream 메서드
        // :: == 메서드 참조

        //nameList.forEach(System.out::println);
        // == nameList의 모든 요소를 순차 접근 하면서
        // 각 요소를 System.out(PrintStream)의
        // println(String str)의 매개변수로 전달하여 수행


        // 매개변수 메서드 참조
        // 람다식
        BinaryOperator<Integer> operator1 = (a, b) -> a + b;
        System.out.println("operator1.apply(1, 2) = " + sumTwoNumbers(operator1, 1, 2));

        System.out.println("sumTwoNumbers((a, b) -> a + b, 10, 20) = " + sumTwoNumbers((a, b) -> a + b, 10, 20));        
        
        //내가 만든 정적 메서드 참조
        System.out.println("sumTwoNumbers(MethodRefTest::sum, 10, 20) = " + sumTwoNumbers(MethodRefTest::sum, 10, 20));
        
        //자바 제공 메서드
        System.out.println("sumTwoNumbers(Integer::sum, 10, 20) = " + sumTwoNumbers(Integer::sum, 10, 20));
        
        
    }

    // BinaryOperator<T> : T매개변수 2개 -> T 1개로 반환
    public static int sumTwoNumbers(BinaryOperator<Integer> op, int i, int j) {
        return op.apply(i, j);
    }

    // 내가 만든 더하기 메서드 (int 매개변수 2개 -> int 1 개로 반환)
    public static int sum(int a, int b) {
        return a + b;
    }
}
