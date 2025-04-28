//Interface for devices that can be turned on/off
interface Switchable {
  void turnOn();
  void turnOff();
}

//Interface for devices with adjustable settings
interface Adjustable {
  void increase();
  void decrease();
}

//Interface for devices that can be connected to the network
interface Connectable {
  void connect();
  void disconnect();
}

//SmartBulb class implementing all three interfaces
class SmartBulb implements Switchable, Adjustable, Connectable {
  private boolean isOn = false;
  private int brightness = 50; //Default value
  private boolean isConnected = false;

  //Switchable methods
  @Override
  public void turnOn() {
    isOn = true;
    System.out.println("SmartBulb is turned ON.");
  }

  @Override
  public void turnOff() {
    isOn = false;
    System.out.println("SmartBulb is turned OFF.");
  }

//Adjustable methods
  @Overrride
  public void increase() {
    if (brightness < 100) {
      brightness += 10;
      System.out.println("Brightness increased to " + brightness + "%");
    } else {
      System.out.println("Brightness is already at maximum");
    }
  }

  public void decrease() {
    if (brightness > 0) {
      brightness -= 10;
      System.out.println("Brightness decreased to " + brightness + "%");
    } else {
      System.out.println("Brightness is already at minimum");
    }
  }

}
