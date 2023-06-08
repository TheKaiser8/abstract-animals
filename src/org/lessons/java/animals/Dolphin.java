package org.lessons.java.animals;

public class Dolphin extends Animal {

    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("pesci e calamari");
    }

    @Override
    public void noise() {
        System.out.println("iiiii-iiiii"); // onomatopea del fischio del delfino
    }
}
