package ru.geekbrains.java.HomeWork.java_three.hw_4;

public class Main {
    public static volatile char c = 'A';
    public static final Object MONITOR = new Object();

    public static void main(String[] args) {
        MyThread t1 = new MyThread('A', 'B');
        MyThread t2 = new MyThread('B', 'C');
        MyThread t3 = new MyThread('C', 'A');

        t1.start();
        t2.start();
        t3.start();

    }
}
