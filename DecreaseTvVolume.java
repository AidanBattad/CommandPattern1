package commandPattern;
class DecreaseTvVolume implements Command {
    private Tv receiver;
    public DecreaseTvVolume(Tv tv)
    {
    }


    void DecreaseTVVolume(Tv receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute()
    {
        if (receiver != null)
        {
            receiver.decreaseVolume();
        } 
        else
        {
            System.out.println("TV is not On. Unable to decrease volume.");
        }}}
    
