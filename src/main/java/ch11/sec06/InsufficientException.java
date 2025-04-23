package ch11.sec06;

public class InsufficientException extends Throwable {
    public InsufficientException() {
    }

    public InsufficientException(String message) {
        super(message);
    }
}
