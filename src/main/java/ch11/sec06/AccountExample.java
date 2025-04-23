package ch11.sec06;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
        try {
            account.withdraw(5000);
            account.withdraw(7000);
        } catch (InsufficientException e) {
            System.out.println(e.getMessage());
        }
    }
}
