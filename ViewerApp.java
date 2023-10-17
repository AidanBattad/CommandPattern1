package commandPattern;

public class ViewerApp {
    public static void main(String[] args) 
  {
        RemoteControl remote = new RemoteControl();

        Light light = new Light();
        TurnOnLight lightOnCommand = new TurnOnLight(light);
        TurnOffLight lightOffCommand = new TurnOffLight(light);

        remote.setCommand(lightOnCommand);
        remote.pressButton();  

       
        remote.setCommand(lightOffCommand);
        remote.pressButton(); 

        Tv tv = new Tv();
        PowerOnTv tvOnCommand = new PowerOnTv(tv);
        PowerOffTv tvOffCommand = new PowerOffTv(tv);
        IncreaseTvVolume increaseTVVolumeCommand = new IncreaseTvVolume(tv);
        DecreaseTvVolume decreaseTVVolumeCommand = new DecreaseTvVolume(tv);

        remote.setCommand(tvOnCommand);
        remote.pressButton(); 
        remote.setCommand(tvOffCommand);
        remote.pressButton(); 
        remote.setCommand(increaseTVVolumeCommand);
        remote.pressButton();


        remote.setCommand(decreaseTVVolumeCommand);
        remote.pressButton();
    }}
