package ru.geekbrains.java.HomeWork.java_three.hw_5;

import java.util.concurrent.Semaphore;

public class Tunnel extends Stage {
    public Tunnel() {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
    }
    @Override
    public void go(Car c) {//НАДО СДЕЛАТЬ тАК ЧТО бЫ ЭТИМ МЕТОДОМ МОГЛИ ПОЛЬЗОВАТЬСЯ НЕ БОЛЬШЕ ПОЛОВИНЫ УЧАСТНИКОВ
        Semaphore smp = new Semaphore(Main.CARS_COUNT / 2);
        try {
            try {
                smp.acquire();
                System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
                System.out.println(c.getName() + " начал этап: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(c.getName() + " закончил этап: " + description);
                smp.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

