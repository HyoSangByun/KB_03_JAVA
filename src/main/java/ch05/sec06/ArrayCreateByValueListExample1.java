package ch05.sec06;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {

        String[] season = {"Spring", "Summer", "Autumn", "Winter"};

        int[] scores = {83, 90, 87};

        //배열의 항목값 읽기
        System.out.println("season[0] : " + season[0]);
        System.out.println("season[1] : " + season[1]);
        System.out.println("season[2] : " + season[2]);
        System.out.println("season[3] : " + season[3]);

        //인덱스 1번 항목의 값 변경
        season[1] = "여름";
        System.out.println("season[1] : " + season[1]);
        System.out.println();
    }
}
