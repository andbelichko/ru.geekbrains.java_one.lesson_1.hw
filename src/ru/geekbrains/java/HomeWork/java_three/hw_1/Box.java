package ru.geekbrains.java.HomeWork.java_three.hw_1;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    ArrayList<Fruit> boxList = new ArrayList<>();

    public Box() {

    }

    public void putFruit(Fruit fruit) {
        boxList.add(fruit);
    }

    public double getWeight() {
        double result = 0.0;
        for (int i = 0; i < boxList.size(); i++) {
           result += boxList.get(i).getFruitWeight();
        }
        return result;
    }

    public boolean compare(Box box) {
        return this.getWeight() - box.getWeight() < 0.0001;
    }

    public void pourOver(Box<T> box) {
        for (int i = 0; i < this.boxList.size(); i++) {
            box.putFruit(this.boxList.get(i));
        }
        this.boxList.removeAll(boxList);
    }

    public void toStr() {
        System.out.println(boxList);
    }

    public static void main(String[] args) {

    }
}
