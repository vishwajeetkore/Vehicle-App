public class Vehicle {

    private String name;
    private int currentspeed;
    private int currentdirection;

    public Vehicle(String name) {
        this.name = name;
        this.currentspeed = 0;
        this.currentdirection = 0;
    }

    public void steer(int direction)
    {
        this.currentdirection += direction;
        System.out.println("steer method is called Steering at : "+ currentdirection+ " degree");
    }

    public void move(int speed, int direction)
    {
        currentspeed = speed;
        currentdirection = direction;
        System.out.println("move method called : move at : "+currentspeed + " at direction : "+currentdirection);
    }

    public int getCurrentspeed() {
        return currentspeed;
    }

    public void setCurrentspeed(int currentspeed) {
        this.currentspeed = currentspeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentdirection() {
        return currentdirection;
    }

    public void setCurrentdirection(int currentdirection) {
        this.currentdirection = currentdirection;
    }

    public void stop()
    {
        this.currentspeed = 0;
        System.out.println("vehicle is stopped ");
    }
}
