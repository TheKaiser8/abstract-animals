package org.lessons.java.animals;

public abstract class Animal {
    // FIELDS
    private String name;

    // CONSTRUCTOR
    public Animal(String name) {
        this.name = name;
    }

    // GETTERS & SETTERS
    public String getName() {
        return name;
    }

    // METHODS
    public void sleep() {
        System.out.println("Zzz");
    }

    // ABSTRACT METHODS
    public abstract void eat();

    public abstract void noise();
}
