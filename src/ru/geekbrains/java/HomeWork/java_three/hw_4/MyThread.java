package ru.geekbrains.java.HomeWork.java_three.hw_4;

public class MyThread extends Thread {
    private char letter;
    private char nextLetter;

    public MyThread(char letter, char nextLetter){
        this.letter = letter;
        this.nextLetter = nextLetter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (Main.MONITOR) {
                try {
                    while (Main.c != letter)
                        Main.MONITOR.wait();
                    System.out.print(letter);
                    Main.c = nextLetter;
                    Main.MONITOR.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
