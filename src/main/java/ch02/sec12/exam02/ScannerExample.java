package ch02.sec12.exam02;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("입력문자열: ");
            String input = scanner.nextLine();
            if (input.equals("q")) {
                System.out.println("종료");
                break;
            }
            System.out.println("출력문자열: " + input);
        }
    }
}
