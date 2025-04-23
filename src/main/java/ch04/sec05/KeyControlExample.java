package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = 0;

        while (true) {
            printMenu();
            int a = sc.nextInt();

            if (a == 1 ) {
                System.out.println("선택 : " + a);
                value++;
                System.out.println("현재 속도 = " + value);
            } else if (a == 2) {
                System.out.println("선택 : " + a);
                value--;
                System.out.println("현재 속도 = " + value);
            } else if (a == 3) {
                System.out.println("선택 : " + a);
                System.out.println("프로그램 종료1");
                break;
            }

        }
    }

    static void printMenu() {
        System.out.println("--------------------------");
        System.out.println("1. 중속 | 2. 감속 | 3. 중지");
        System.out.println("--------------------------");
    }


}
