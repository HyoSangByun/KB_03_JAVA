package ch08.sec08;

public class SmartTelevision implements RemoteControl, Searchable {

    @Override
    public void turnOff() {
        System.out.println("Turning off SmartTelevision");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning On SmartTelevision");
    }

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }
}
