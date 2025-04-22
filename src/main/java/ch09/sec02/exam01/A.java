package ch09.sec02.exam01;

public class A {
    //인스턴스멤버클래스
    class B { }
    //인스턴스필드값으로B객체대입
    B field = new B();
    //생성자
    A() {
        B b=new B();
    }
    //인스턴스메소드
    void method() {
        B b=new B();
    }
}
