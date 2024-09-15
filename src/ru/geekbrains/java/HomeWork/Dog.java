package ru.geekbrains.java.HomeWork;

public class Dog extends Animal{
    static int stamina = 500;
    double jumpHeight = 0.5;
    int swimLength = 10;

    Dog(String name, String color, int age){
        super(name, color, age);
    }

    @Override
    void run(double barrier){
        if(stamina >= barrier){
            System.out.println("Собакен пробежал дистанцию");
        } else {
            System.out.println("Собака непонимающи посмотрела и не стала бежать");
        }
    }
    @Override
    void swim(double barrier){
        if(swimLength >= barrier){
            System.out.println("Собакен проплыл дистанцию");
        } else {
            System.out.println("Собака непонимающи посмотрела и не стала плыть");
        }
    }
    @Override
    void jamp(double barrier){
        if(jumpHeight >= barrier){
            System.out.println("Собакен перепрыгнул барьер");
        } else {
            System.out.println("Собака непонимающи посмотрела и не стала прыгать");
        }
    }

}
