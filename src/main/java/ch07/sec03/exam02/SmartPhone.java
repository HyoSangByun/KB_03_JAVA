package ch07.sec03.exam02;

public class SmartPhone extends Phone {

    public SmartPhone(String model, String color) {
        super(model, color); // 부모 클래스의 생성자 호출
        System.out.println("SmartPhone(String model, String color) 생성자 실행");
    }
}
