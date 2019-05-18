package TestCommandPattern;

public class TurnVolumeUP implements Command {

    ElectronicDevice electronicDevice;

    public TurnVolumeUP(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.volumeUp();
    }
}
