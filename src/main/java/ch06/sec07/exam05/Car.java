package main.java.ch06.sec07.exam05;

public class Car {

    // 필드 선언
    public String company = "현대자동차";
    public String model;
    public String color;
    public int maxSpeed;

    public Car(String model) {
        this(model, "은색", 250);
    }

    public Car(String model, String color) {
        this(model, color, 250);
    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
