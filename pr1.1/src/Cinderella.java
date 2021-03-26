public class Cinderella extends Human {
    private int footSize;

    public Cinderella() {
    }

    public Cinderella(String name, int age, int footSize) {
        super(name, age);
        this.footSize = footSize;
    }

    public int getFootSize() {
        return footSize;
    }

    public void setFootSize(int footSize) {
        this.footSize = footSize;
    }

    @Override
    public String toString() {
        return "Cinderella{" +
                "footSize=" + footSize +
                "} " + super.toString();
    }
}
