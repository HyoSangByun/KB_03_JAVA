package ch06.advanced;

public class Database {
    private static final Database instance = new Database();

    public Database() {
    }

    private String connection = "MySQL";

    public String connect() {
        System.out.println(connection + "에 연결합니다.");
        return connection;
    }

    public void disconnect() {
        System.out.println(connection + "을 닫습니다.");
    }

    public String getConnection() {
        return connection;
    }

    public static Database getInstance() {
        return instance;
    }
}
