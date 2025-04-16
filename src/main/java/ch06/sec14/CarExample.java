package main.java.ch06.sec14;

public class CarExample {

    public static void main(String[] args) {
        Car car = new Car();

        //잘못된 속도(-50)로 변경
        car.setSpeed(-50);
        System.out.println("현재 속도: " + car.getSpeed());

        //올바른 속도로 변경
        car.setSpeed(60);
        System.out.println("현재 속도: " + car.getSpeed());

        //멈춤
        if (!car.isStop()) {
            car.setStop(true);
        }
        System.out.println("현재 속도: " + car.getSpeed());
    }

}
