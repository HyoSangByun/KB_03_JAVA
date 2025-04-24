package ch04.exam;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int length = 0;
        while (true) {
            printMenu();
            int i = sc.nextInt();
            System.out.println("선택> " + i);
            if (i == 1) {
                System.out.print("학생수> ");
                length= sc.nextInt();
                array = new int[length];
            }
            else if (i == 2) {
                for (int j = 0; j < length; j++) {
                    System.out.print("array[" + j + "]>" );
                    int v = sc.nextInt();
                    array[j] = v;
                }
            } else if (i == 3) {
                for (int k = 0; k < length; k++) {
                    System.out.println("array[" + k + "] = " + array[k]);
                }
            } else if (i == 4) {
                int sum = 0;
                int max = Integer.MIN_VALUE;
                for (int i1 : array) {
                    sum += i1;
                    max = Math.max(max, i1);
                }
                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + sum / length);
            } else {
                break;
            }
        }

        System.out.println("프로그램 종료");
    }

    private static void printMenu() {
        System.out.println("==========================");
        System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
        System.out.println("==========================");
    }
}
