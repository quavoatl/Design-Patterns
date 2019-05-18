package TestCommandPattern;

public class CommanMain {

    public static void main(String[] args) {

        ElectronicDevice electronicDevice = new Television();
        TurnTelevisionON onCommand = new TurnTelevisionON(electronicDevice);
        ButtonDevice onButton = new ButtonDevice(onCommand);
        onButton.press();

        System.out.println("=============================");

        TurnTelevisionOFF offCommand = new TurnTelevisionOFF(electronicDevice);
        onButton = new ButtonDevice(offCommand);
        onButton.press();

    }
}
