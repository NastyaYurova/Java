package Task1;

public class Cat extends Mammal {
    private String FavFood;

    public Cat() {
    }

    public Cat(String FavFood) {
        this.FavFood = FavFood;

    }

    public Cat(String name, String vyd, String color, int weight, String FavFood) {
        super(name, vyd, color, weight);
        this.FavFood = FavFood;
    }

    public String getFavFood() {
        return FavFood;
    }

    public void setFavFood(String favFood) {
        this.FavFood = favFood;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "FavFood='" + FavFood +
                "} " + super.toString();
    }
}



