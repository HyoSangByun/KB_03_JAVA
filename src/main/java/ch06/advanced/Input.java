package ch06.advanced;

import java.util.Scanner;

public class Input {
    public static Scanner sc = new Scanner(System.in);

    public static String read(String title) {
        System.out.print(title);
        String s = sc.nextLine();
        return s;
    }

    public static String read(String title, String defaultValue) {
        System.out.print(title + "(" + defaultValue + "): ");
        String input = sc.nextLine();
        return input.isEmpty() ? defaultValue : input;
    }

    public static int readInt(String title) {
        System.out.print(title);
        int input = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거용
        return input;
    }


    public static boolean confirm(String title, boolean defaultValue) {
        String prompt = defaultValue ? "(Y/n): " : "(y/N): ";
        System.out.print(title + " " + prompt);
        String input = sc.nextLine().trim().toLowerCase();

        if (input.isEmpty()) return defaultValue;
        return input.equals("y");
    }

    public static boolean confirm(String title) {
        return confirm(title, true); // 기본값 true로 설정
    }
}
