package Task1;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Mammal mammal = new Mammal();
        Bird bird =  new Bird();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Flamingo flamingo = new Flamingo();
        Parrot parrot = new Parrot();

Cat cat_1 = new Cat("Manya","Sfinks","white", 10, "Fish");
Cat cat_2 = new Cat("Vasylina","Main-Kun","Black-Green", 15, "Fish");

Dog dog_1 = new Dog("Santa", "Sobachi","Black", 40, "Vivcharka");
Dog dog_2 = new Dog("Sandra", "Sobachi","White", 20, "Akita-iny");

Flamingo flamingo_1 = new Flamingo("Fenya", "Ptaxy",14, "Brazil", "Pink");
Flamingo flamingo_2 = new Flamingo("John", "Ptaxy",14, "Africa", "White");

Parrot parrot_1 = new Parrot("Sun", "Ptaxy",6, "Neverland", "5");
Parrot parrot_2 = new Parrot("Queue", "Ptaxy",5, "Spain", "10");

 Animal[] animals = new Animal[8];
            animals[0] = cat_1;
            animals[1] = cat_2;
            animals[2] = dog_1;
            animals[3] = dog_2;
            animals[4] = flamingo_1;
            animals[5] = flamingo_2;
            animals[6] = parrot_1;
            animals[7] = parrot_2;

            System.out.println(Arrays.toString(animals));
        }
}






