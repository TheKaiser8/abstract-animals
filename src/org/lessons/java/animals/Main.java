package org.lessons.java.animals;

public class Main {
    public static void main(String[] args) {
        Animal[] noahsArk = new Animal[4];
        noahsArk[0] = new Dog("Tom");
        noahsArk[1] = new Dolphin("Flipper");
        noahsArk[2] = new Eagle("Odissey");
        noahsArk[3] = new Sparrow("Fly");

        String species;

        for (Animal a : noahsArk) {
            species = a.getClass().getSimpleName();
            switch (species) {
                case "Dog":
                    species = "cane";
                    break;
                case "Dolphin":
                    species = "delfino";
                    break;
                case "Eagle":
                    species = "aquila";
                    break;
                case "Sparrow":
                    species = "passerotto";
                    break;
            }
            System.out.println(a.getName() + " è un " + species + ",");
            System.out.print("mangia ");
            a.eat();
            System.out.print("e il suo verso fa ");
            a.noise();
            System.out.println("\n");
        }
    }
}
