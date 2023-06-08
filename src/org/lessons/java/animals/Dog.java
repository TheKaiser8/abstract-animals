package org.lessons.java.animals;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("crocchette");
    }

    @Override
    public void noise() {
        System.out.println("Bau!");
    }
}
