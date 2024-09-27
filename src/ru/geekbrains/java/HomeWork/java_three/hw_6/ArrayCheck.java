package ru.geekbrains.java.HomeWork.java_three.hw_6;

public class ArrayCheck {
    public static boolean ArrayCheck4And1(int[] arr) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                count1++;
            }
            if (arr[i] == 1) {
                count2++;
            }
        }
        return !(count1 == 0 || count2 == 0);
    }
}
