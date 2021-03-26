package Task2;

public class User implements Women_Clothes, Men_Clothes {
    private String human;

    public User() {
    }

    public User(String human) {
        this.human = human;
    }

    public String getHuman() {
        return human;
    }

    public void setHuman(String human) {
        this.human = human;
    }

    @Override
    public void WearMen() {
        System.out.println("Wear Men");
    }

    @Override
    public void WearWoman() {
        System.out.println("Wear Woman");
    }

    @Override
    public String toString() {
        return "User{" +
                "human='" + human + '\'' +
                '}';
    }



}
