package commandPattern;

class TurnOnLight implements Command 
{
    private Light receiver;

    TurnOnLight(Light receiver)
    {
        this.receiver = receiver;
    }

    @Override
    public void execute() 
    {
        receiver.turnOn();
    }
}
