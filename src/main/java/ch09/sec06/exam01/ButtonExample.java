package ch09.sec06.exam01;

public class ButtonExample {
    public static void main(String[] args) {
        Button button = new Button();
        //Ok 버튼클릭 이벤트를 처리할 ClickListener구현 클래스(로컬클래스)

        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        }
    }
}
