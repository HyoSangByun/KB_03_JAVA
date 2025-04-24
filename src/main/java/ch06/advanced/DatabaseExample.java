package ch06.advanced;

public class DatabaseExample {
    public static void main(String[] args) {
        Database db = Database.getInstance();

        db.connect();
        System.out.println("데이터베이스: " + db.getConnection());
        db.disconnect();
    }
}
