package behavioral.command;

public class Switch {
    private Command commandOn;
    private  Command commandOff;

    public Switch(Command commandOn, Command commandOff) {
        this.commandOn = commandOn;
        this.commandOff = commandOff;
    }

    void turnOn(){
        commandOn.execute();
    }
    void turnOff(){
        commandOff.execute();
    }
}
