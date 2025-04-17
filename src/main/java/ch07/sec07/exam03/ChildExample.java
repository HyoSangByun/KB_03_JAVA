package ch07.sec07.exam03;

public class ChildExample extends Parent {

    public static void main(String[] args) {
        Parent parent = new Child();

        // Parent 멤버 사용
        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        // 다운캐스팅
        Child child = (Child) parent;
        child.field2 = "data2";
        child.method3();

        child.field2 = "data2";
        child.method3();
    }
}
