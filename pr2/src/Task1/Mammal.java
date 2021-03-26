package Task1;

public class Mammal extends Animal{
    private String color;
    private int weight;

public Mammal(){

}
    public Mammal(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

public Mammal(String name, String vyd, String color, int weight) {
        super(name, vyd);
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }



    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Mammal{" +
                "color='" + color +
                ", weight=" + weight +
                "} " + super.toString();
    }
}
