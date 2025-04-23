package ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
        intArray[0] = 10;
        // intArray는 null이기 때문에 실제 배열 객체를 참조하지 않음

        String str = null;
        System.out.println("총 문자 수: " + str.length());
        // str 역시 null 상태로 문자열 객체를 참조하고 있지 않음
    }
}
