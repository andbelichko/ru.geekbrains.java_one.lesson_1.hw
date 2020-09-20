package ru.geekbrains.java.HomeWork;

public class Cat extends Animal {
    static int stamina = 200;
    static int jampHeight = 2;

    Cat(String name, String color, int age){
        super(name, color, age);
    }

    @Override
   void run(double barrier){
        if(stamina >= barrier){
            System.out.println("Кот пробежал дистанцию");
        } else{
            System.out.println("Пробежав часть дистанции, кот устало мяукнул и пошёл по своим делам");
        }
    }
    @Override
    void swim(double barrier){
        System.out.println("Кот зашипел и убежал прочь от воды");
    }
    @Override
    void jamp(double barrier){
        if(jampHeight >= barrier){
            System.out.println("Кот перепрыгнул барьер");
        } else{
            System.out.println("Кот отказывается прыгать");
        }
    }

}

