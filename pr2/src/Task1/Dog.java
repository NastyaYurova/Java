package Task1;

public class Dog extends Mammal {
    private String poroda;

    public Dog() {
    }

    public Dog(String poroda) {
      this.poroda = poroda;
    }

    public Dog(String name, String vyd, String color, int weight, String poroda) {
        super(name, vyd, color, weight);
        this.poroda = poroda;

    }



    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public String getPoroda() {
        return poroda;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "poroda=" + poroda +
                "} " + super.toString();
    }
}

