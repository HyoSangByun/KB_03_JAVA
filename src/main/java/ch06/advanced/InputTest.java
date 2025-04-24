package ch06.advanced;

public class InputTest {
    public static void main(String[] args) {
        // 문자열 입력
        String name = Input.read("이름: ");
        System.out.println("입력값: " + name);

        name = Input.read("이름", "홍길동");
        System.out.println("입력값: " + name);

        int age = Input.readInt("나이: ");
        System.out.println("입력값: " + age);

        boolean end = Input.confirm("종료할까요?", false);
        System.out.println("입력값: " + end);

        end = Input.confirm("종료할까요?");
        System.out.println("입력값: " + end);
//
//        // 확인 (기본값 false)
//        boolean again = Input.confirm("종료할까요?", false);
//        System.out.println("입력값: " + again);
    }
}
