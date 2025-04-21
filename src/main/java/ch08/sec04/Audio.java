package ch08.sec04;

public class Audio implements RemoteControl {
    private int volume;

    @Override
    public void turnOff() {
        System.out.println("Audio turning off");
    }

    @Override
    public void turnOn() {
        System.out.println("Audio turning on");
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
        System.out.println("현재 Audio 볼륨: 값");
    }
}
