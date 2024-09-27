package ru.geekbrains.java.HomeWork.java_three.hw_6;

import java.util.ArrayList;
import java.util.Arrays;

public class AfterFour {

    public Integer [] afterFour4(int [] arr1) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 4 && count == 0) {
                count++;
                for (int j = i ; j < arr1.length  ; j++) {
                    arrayList.add(arr1[j]);
                }

            } else if (arr1[i] == 4 && count != 0) {
                arrayList.removeAll(arrayList);
                for (int x = 1 + i; x < arr1.length; x++) {
                    arrayList.add(arr1[x]);
                }
            }
        }
        if (count == 0) {
            throw new RuntimeException("В исходном массиве не содержатся 4");
        }
        int [] arrReturn = new int[arrayList.size()];
        for (int i = 0; i < arrReturn.length; i++) {
            arrReturn[i] = arrayList.get(i);
        }
        Integer[] array1 = arrayList.toArray(new Integer[arrayList.size()]);
        return array1;
    }
}

