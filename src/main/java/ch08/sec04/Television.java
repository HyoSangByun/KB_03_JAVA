package ch08.sec04;

public class Television implements RemoteControl{
    private int volume;

    @Override
    public void turnOff() {
        System.out.println("Television turning off");
    }

    @Override
    public void turnOn() {
        System.out.println("Television turning on");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > MAX_VOLUME) {
            this.volume = MAX_VOLUME;
        } else if (volume < MIN_VOLUME) {
            this.volume = MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: 값");
    }
}
