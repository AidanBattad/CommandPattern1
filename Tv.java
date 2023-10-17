package commandPattern;

class Tv  {
  private int volume;
    void turnOn()
    {
        System.out.println("Turning on TV.");
    }

    void turnOff()
    {
        System.out.println("Turning off TV.");
    }
        void increaseVolume()
        {
            volume++;
            System.out.println("Increasing the TV volume. Current volume: " + volume);
        }

        void decreaseVolume()
        {
            if (volume > 0) 
            {
                volume--;
                System.out.println("Decreasing the TV volume. Current volume: " + volume);
            } 
            else 
            {
                System.out.println("TV volume is already at its minimum.");
            }
        }
    }
