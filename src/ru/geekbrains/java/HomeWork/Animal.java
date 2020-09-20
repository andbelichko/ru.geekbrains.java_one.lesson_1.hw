package ru.geekbrains.java.HomeWork;

public abstract class Animal {

    protected String name;
    protected String color;
    protected int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;

    }

    abstract void run(double barrier);

    abstract void swim(double barrier);

    abstract void jamp(double barrier);

}

