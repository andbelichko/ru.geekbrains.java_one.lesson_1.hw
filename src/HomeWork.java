import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
//**********Задание 1
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        replacement(array);
        replacements(array);

//********Задание 2
        int[] array2 = new int[8];
        generate(array2);

//***********Задание3
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplier(array3);

//**********Задание 4
        int[] array4 = {5, 8, 6, 92, 9, 12, 25, 60, 4, 64};

        int varMax = max(array4);
        int varMin = min(array4);

//**********Задание 5
//        5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
//                заполнить его диагональные элементы единицами, используя цикл(ы);

        int[][] array5 = new int[6][6];
        diagonal(array5);

    }


    //Задание 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    //Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
    private static void replacement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }

        }
    }

    //Задание 1. второй вариант.
    private static void replacements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }
    }


    //Задание 2. Задать пустой целочисленный массив размером 8. Написать метод,
    //который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
    private static int[] generate(int[] arr2) {
        int j = 1;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr2[i] + j;
            j += 3;
        }
        return arr2;
    }


    //Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,
    //принимающий на вход массив и умножающий числа меньше 6 на 2;
    private static int[] multiplier(int[] arr3) {

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }

        }
        return arr3;
    }


//Задание 4. Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;

    private static int max(int[] arr4) {
        int result = arr4[0];
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] > result) {
                result = arr4[i];
            }

        }
        return result;
    }

    private static int min(int[] arr4) {
        int result = arr4[0];
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] < result) {
                result = arr4[i];
            }

        }
        return result;
    }

    //    Заание 5. В этом задании смог только одну диагональ заполнить. Пока не придумал как вторую заполнить.
    private static int[][] diagonal(int[][] arr5) {

        int record = 1;
        for (int i = 0; i < arr5.length; i++) {

            for (int j = 0; j < arr5.length; j++) {

                if (arr5[i][j] == arr5[j][j]) {
                    arr5[j][j] = record;

                }
            }

        }
        return arr5;
    }

}