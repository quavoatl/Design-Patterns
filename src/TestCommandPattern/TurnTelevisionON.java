package TestCommandPattern;

public class TurnTelevisionON implements Command {

    ElectronicDevice electronicDevice;

    public TurnTelevisionON(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {

        electronicDevice.turnOn();
    }
}
