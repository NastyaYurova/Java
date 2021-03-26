package Task1;

public class Animal {
    private String name;
    private String vyd;

    public Animal() {
    }

    public Animal(String name, String vyd) {
        this.name = name;
        this.vyd = vyd;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getAge() {

        return vyd;
    }

    public void setAge(String age) {

        this.vyd = vyd;
    }



    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name+ '\'' +
                ", age='" + vyd + '\'' +
                '}';
    }
}

