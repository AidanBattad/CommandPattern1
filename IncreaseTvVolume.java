package commandPattern;

class IncreaseTvVolume implements Command
{
    private Tv receiver;

    IncreaseTvVolume(Tv receiver)
    {
        this.receiver = receiver;
    }
    @Override
    public void execute() 
    {
        if (receiver != null) 
        {
            receiver.increaseVolume();
        } else 
        {
            System.out.println("TV receiver not set. Cannot increase volume.");
        }
    }
}
