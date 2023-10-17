package commandPattern;

class TurnOffLight implements Command 
{
    private Light receiver;

    TurnOffLight(Light receiver)
    {
        this.receiver = receiver;
    }

    @Override
    public void execute()
    {
        receiver.turnOff();
    }
}
