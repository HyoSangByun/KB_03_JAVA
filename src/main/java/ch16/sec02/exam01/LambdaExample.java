package ch16.sec02.exam01;

public class LambdaExample {
    public static void main(String[] args) {
        Person p = new Person();

        p.action(() -> {
            System.out.println("Hello World1");
            System.out.println("Hello World2");
        });

        p.action(() -> System.out.println("Hello World3"));
    }
}
