package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("원 면적: " + cal.areaCircle(10));

        System.out.println();

        Computer com = new Computer();
        System.out.println("원 면적: " + com.areaCircle(10));
    }
}
