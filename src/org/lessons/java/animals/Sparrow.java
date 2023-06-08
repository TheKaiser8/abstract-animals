package org.lessons.java.animals;

public class Sparrow extends Animal {

    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("cereali e semi");
    }

    @Override
    public void noise() {
        System.out.println("Cip!");
    }
}
