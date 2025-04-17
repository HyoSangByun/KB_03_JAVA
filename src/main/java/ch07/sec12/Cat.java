package ch07.sec12;

public class Cat extends Animal {

    public Cat() {
        super.name = "나비";
    }

    @Override
    public void sound() {
        System.out.println(name + " 야옹 냐옹 먀옹");
    }
}
