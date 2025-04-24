package ch04.exam;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = 0;
        while (true) {
            printMenu();
            int i = sc.nextInt();
            System.out.println("선택> " + i);
            if (i == 4) break;
            else if (i == 1) {
                int m= sc.nextInt();
                System.out.println("예금액> " + m);
                money += m;
            } else if (i == 2) {
                int m= sc.nextInt();
                System.out.println("출금액> " + m);
                money -= m;
            } else if (i == 3) {
                System.out.println("잔고> " + money);
            }
        }

        System.out.println("프로그램 종료");
    }

    private static void printMenu() {
        System.out.println("==========================");
        System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
        System.out.println("==========================");
    }
}
