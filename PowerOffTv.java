package commandPattern;

class PowerOffTv implements Command 
{
    private Tv receiver;

    PowerOffTv(Tv receiver)
    {
        this.receiver = receiver;
    }

    @Override
    public void execute() 
    {
        receiver.turnOff();
    }
}
