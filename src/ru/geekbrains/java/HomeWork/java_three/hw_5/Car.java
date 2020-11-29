package ru.geekbrains.java.HomeWork.java_three.hw_5;

import ru.geekbrains.java.HomeWork.java_three.hw_5.Race;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class Car implements Runnable {

    private static int CARS_COUNT;
    static {
        CARS_COUNT = 0;
    }
    private Race race;
    private int speed;
    private String name;
    CyclicBarrier cb;
    AtomicInteger ai;
    CountDownLatch cdlStart;
    CountDownLatch cdlFinish;

    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public Car(Race race, int speed, CyclicBarrier cb, AtomicInteger ai, CountDownLatch cdlStart, CountDownLatch cdlFinish) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
        this.cb = cb;
        this.ai = ai;
        this.cdlStart = cdlStart;
        this.cdlFinish = cdlFinish;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
            try {
                cdlStart.countDown();
                cb.await();

            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        if(ai.get() == 0) {
            ai.incrementAndGet();
            System.out.println(this.name + " Win ");
        }
        cdlFinish.countDown();
    }
}

