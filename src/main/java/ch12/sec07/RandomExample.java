package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        int[] select = new int[6];
        int[] randoms = new int[6];
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            select[i] = random.nextInt(45) + 1;
        }

        for (int i = 0; i < 6; i++) {
            randoms[i] = random.nextInt(45) + 1;
        }

        Arrays.sort(select);
        Arrays.sort(randoms);

        boolean flag = true;
        for (int i = 0; i < 6; i++) {
            if (select[i] != randoms[i]) {
                flag = false;
            }
        }

        System.out.println("===선택 번호===");
        for (int i = 0; i < 6; i++) {
            System.out.print(select[i] + " ");
        }
        System.out.println();
        System.out.println("===당첨 번호===");
        for (int i = 0; i < 6; i++) {
            System.out.print(randoms[i] + " ");
        }
        System.out.println();

        if (flag) {
            System.out.println("1등에 당첨하셨습니다.");
        } else {
            System.out.println("1등에 당첨하지 못하였습니다.");
        }
    }
}
