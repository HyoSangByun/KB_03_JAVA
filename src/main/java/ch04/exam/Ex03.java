package ch04.exam;

public class Ex03 {
    public static void main(String[] args) {
        for (int j = 1; j <= 5; j++) {
            for (int i = 5; i - j >= 0; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
