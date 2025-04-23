package ch05.sec05;

public class SplitExample {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
        String[] split = board.split(",");

        //인덱스별로 읽기
        System.out.println("번호: " + split[0]);
        System.out.println("제목: " + split[1]);
        System.out.println("내용: " + split[2]);
        System.out.println("성명: " + split[3]);
        System.out.println();

        //for 문을 이용한 읽기
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }
}
