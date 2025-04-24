package ch14.exam;

public class ThreadExample {
    public static void main(String[] args) {
        new MovieThread().start();
        new Thread(new MusicRunnable()).start();
    }
}
