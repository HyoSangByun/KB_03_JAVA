package ch08.sec11.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.run();

        myCar.tire1 = new HankookTire();
        myCar.tire2 = new HankookTire();
        myCar.run();
    }
}
