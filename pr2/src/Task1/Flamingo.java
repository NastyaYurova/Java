package Task1;

public class Flamingo extends Bird{
    private String WingColor;

    public Flamingo() {
    }

    public Flamingo(String wingColor) {
        this.WingColor = wingColor;

    }

    public Flamingo(String name, String vyd, int speed, String home, String wingColor) {
        super(name,vyd,speed,home);
        this.WingColor = wingColor;
    }

    public void setWingColor(String wingColor) {
       this.WingColor = wingColor;
    }

    public String getWingColor() {
        return WingColor;
    }

    @Override
    public String toString() {
        return "Flamingo{" +
                "WingColor" + WingColor +
                "} " + super.toString();
    }
}

