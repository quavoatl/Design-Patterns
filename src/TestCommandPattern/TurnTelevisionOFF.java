package TestCommandPattern;

public class TurnTelevisionOFF implements Command{

    ElectronicDevice electronicDevice;

    public TurnTelevisionOFF(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {

        electronicDevice.turnOff();
    }
}
