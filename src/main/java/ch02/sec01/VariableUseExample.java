package ch02.sec01;

public class VariableUseExample {
    public static void main(String[] args) {
        int hour = 3;
        int minute = 5;
        int hours = 60;

        int totalMinutes = hour * hours + minute;
        System.out.printf("%d시간 %d분\n 총 %d분", hour,minute, totalMinutes );
    }
}
