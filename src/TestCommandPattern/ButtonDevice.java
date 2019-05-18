package TestCommandPattern;

public class ButtonDevice {

    Command theCommand;

    public ButtonDevice(Command newCommand){
        this.theCommand = newCommand;
    }

    void press(){
        theCommand.execute();
    }
}
