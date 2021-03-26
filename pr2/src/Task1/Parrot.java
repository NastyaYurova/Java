package Task1;

public class Parrot extends Bird {
    private String length;

    public Parrot() {
    }

    public Parrot(String length) {
        this.length = length;

    }

    public Parrot(String name, String vyd, int speed, String home, String length) {
        super(name,vyd,speed,home);
        this.length = length;
    }

    public String getLength() {
        return length;
    }


    public void setLength(String length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "length='" + length +
                "} " + super.toString();
    }
}
