package org.lessons.java.animals;

public class Eagle extends Animal {

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
}
