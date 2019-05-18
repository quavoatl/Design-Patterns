package TestCommandPattern;

public class Television implements ElectronicDevice {
    private int volume = 0;

    @Override
    public void turnOn() {
        System.out.println("TV turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV turned OFF");
    }

    @Override
    public void volumeDown() {
        volume++;
        System.out.println("TV volume is at: " + volume);
    }

    @Override
    public void volumeUp() {
        volume--;
        System.out.println("TV volume is at: " + volume);

    }


}
