package org.lessons.java.animals;

public class Eagle extends Animal implements CanFly {

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void eat() {

    }

    @Override
    public void noise() {
        System.out.println("kreeee!"); // onomatopea del verso dell'aquila
    }

    @Override
    public void fly() {
        System.out.println("Sto volando!!!");
    }
}
