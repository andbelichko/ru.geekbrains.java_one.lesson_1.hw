package ru.geekbrains.java.HomeWork;

public class Main {
    public static void main(String [] args){
    Cat cat = new Cat("Салем", "Чёрный", 3);
    cat.jamp(1.5);
    cat.run(135.6);
    cat.swim(12);

    Dog dog = new Dog("Лорд", "Рыжий", 4);
    dog.jamp(0.4);
    dog.run(480.0);
    dog.swim(4.5);
    }
}
