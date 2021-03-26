package Task1;

public class Bird extends Animal {
    private int speed;
    private String home;

    public Bird() {
    }

    public Bird(int speed, String home) {
        this.speed = speed;
        this.home = home;
    }

    public Bird(String name, String vyd, int speed, String home) {
        super(name, vyd);
        this.speed = speed;
        this.home = home;
    }

    public int getSpeed() {
        return speed;
    }

    public String getHome() {
        return home;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setHome(String home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "speed=" + speed +
                ", home='" + home +
                "} " + super.toString();
    }
}
