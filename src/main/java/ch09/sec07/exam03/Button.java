package ch09.sec07.exam03;

public class Button {
    //정적 멤버 인터페이스
    public static interface ClieckListener {
        //추상 메소드
        void onClick();
    }

    //필드
    private ClieckListener clieckListener;

    //메소드
    public void setClickListener(ClieckListener clieckListener) {
        this.clieckListener = clieckListener;
    }

    public void click() {
        this.clieckListener.onClick();
    }
}
