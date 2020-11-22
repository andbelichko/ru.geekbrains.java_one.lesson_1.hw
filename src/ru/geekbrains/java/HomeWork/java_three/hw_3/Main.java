package ru.geekbrains.java.HomeWork.java_three.hw_3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //task1
        byte[] byteArr = new byte[512];
        try (FileInputStream in = new FileInputStream("Kubla Khan.txt")) {
            int count;
            while ((count = in.read(byteArr)) > 0) {
                System.out.print(new String(byteArr, 0, count, "UTF-8"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        //task2
        ArrayList<InputStream> al = new ArrayList<>();
        try {
            al.add(new FileInputStream("Yuggoth1.txt"));
            al.add(new FileInputStream("Yuggoth2.txt"));
            al.add(new FileInputStream("Yuggoth3.txt"));
            al.add(new FileInputStream("Yuggoth4.txt"));
            al.add(new FileInputStream("Yuggoth5.txt"));

            SequenceInputStream in = new SequenceInputStream(Collections.enumeration(al));
            FileOutputStream out = new FileOutputStream("Yuggoth1-5.txt");

            byte[] arr = new byte[512];
            int count;
            while ((count = in.read()) != -1) {
                out.write(count);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
