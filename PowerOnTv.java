package commandPattern;

class PowerOnTv implements Command
{
    private Tv receiver;

    PowerOnTv(Tv receiver)
    {
        this.receiver = receiver;
    }

    @Override
    public void execute()
    {
        receiver.turnOn();
    }
}
