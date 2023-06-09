package org.lessons.java.animals;

public class Dolphin extends Animal implements CanSwim {

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

    @Override
    public void swim() {
        System.out.println("Sto nuotando!!!");
    }
}
