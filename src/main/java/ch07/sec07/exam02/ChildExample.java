package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;
        parent.method1();
        parent.method2();
        //parent.method3();
        //paret는 타입은 Parent이지만 실제 객체는 Child로
        //Parent 기준으로 메서드 호출이 가능하다
    }
}
