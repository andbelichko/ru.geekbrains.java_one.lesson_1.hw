package ru.geekbrains.java.HomeWork.java_two.hw_5;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;

    public static void arrayCopyThr() {
        float[] arr = new float[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            System.currentTimeMillis();
        }
        System.out.println(System.currentTimeMillis() - a);
    }


    public static void arrayCopyMultyThred() {
        float[] arr = new float[size];

        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);
        Thread t0 = new Thread("Thread one");
        t0.start();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

        }
        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);

        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);
    }


    public static void main (String[] args){
        arrayCopyThr();
        arrayCopyMultyThred();
    }
}
