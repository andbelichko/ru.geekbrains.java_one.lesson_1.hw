package ru.geekbrains.java.HomeWork.java_two.hw_2;

import java.util.Scanner;

public class ExсeptionTest {

    public static void main(String[] args) {

        String s = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";

        try {
            String[][] testArr = transformationStringToArray(s, 4 , 4);

            System.out.println(transformationStringArrToInt(testArr));

        } catch (NumberFormatException e){
            e.printStackTrace();
        } catch (RuntimeException exc){
            exc.printStackTrace();

        }

    }

    public static String [][] transformationStringToArray(String s, int x, int y)  {

        RuntimeException exc = new RuntimeException("the resulting matrix size is not 4x4");

        Scanner scanner = new Scanner(s);

        String [][] array = new String[x][y];

        for (int i = 0; i < x; i ++) {
            if(array.length > 4){
                throw exc;
            }
            for (int j = 0; j < y; j++) {
                if (array[i].length > 4){
                    throw exc;
                }
                array[i][j] = scanner.next();
            }
        }
        scanner.close();
        return array;

    }

    public static int transformationStringArrToInt(String[][] array) throws RuntimeException{

        String sNum = "";
        int num;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sNum = array[i][j];
                num = Integer.parseInt(sNum);
                sum += num;
            }

        }
        return sum = sum / 2;
    }

}