package ru.geekbrains.java.HomeWork.java_three.hw_3;

import java.io.*;

public class BookReader {
    public static void main(String[] rgs) {
        //task3
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            final int PAGE_SIZE = 1800;
            int page = 0;
            System.out.println("Укажите путь к книге");
            String path = reader.readLine();

            while (true) {
                System.out.println("\nВведите номер страницы, для выхода введите 0");
                page = Integer.parseInt(reader.readLine()) - 1;
                if (page == -1) break;

                reedBook(path, page, PAGE_SIZE);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static void reedBook(String path, int page, int PAGE_SIZE) {
        try(RandomAccessFile raf = new RandomAccessFile(path, "r")) {
            raf.seek(page * PAGE_SIZE);
            for (int i = 0; i < PAGE_SIZE; i++) {
                System.out.print((char) raf.read());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
