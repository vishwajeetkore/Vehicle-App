public class car extends Vehicle {

  private int wheels;
  private String type;
  private int doors;
  private int gears;
  private boolean ismanual;
  private int currentgear;


    public car(String name, int wheels, int doors, int gears, boolean ismanual, String type) {
        super(name);
        this.type = type;
        this.gears = gears;
        this.doors = doors;
        this.ismanual = ismanual;
        this.wheels = wheels;
        currentgear =1;
    }

    public void changegear(int newgear)
    {
        this.currentgear = newgear;
        System.out.println("changegear method is called : changed to "+this.currentgear+ " gear");
    }

    public void changespeed(int newspeed, int newdirection)
    {
        move(newspeed, newdirection);
        System.out.println("change speed method called : speed -> "+newspeed+" direction ->"+newdirection);
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public boolean isIsmanual() {
        return ismanual;
    }

    public void setIsmanual(boolean ismanual) {
        this.ismanual = ismanual;
    }

    public int getCurrentgear() {
        return currentgear;
    }

    public void setCurrentgear(int currentgear) {
        this.currentgear = currentgear;
    }
}
