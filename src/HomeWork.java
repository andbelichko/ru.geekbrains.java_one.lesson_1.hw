public class HomeWork {

    public static void main(String[] args) {


    }

    //Задание 1.Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой,
    // где a, b, c, d – целочисленные входные параметры этого метода;
    private static double sum(int a, int b, int c, int d) {
        return a * (b + (c / d));


    }

    //Задание 2.Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    private static boolean check(int i, int g) {
        if (i + g >= 10 && i + g <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //Задание 3.Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    private static void posNeg(int g) {
        if (g >= 0) {
            System.out.println("Число " + g + " положительное");
        } else {
            System.out.println("Число " + g + " отрицательное");
        }
    }


    //Задание 4.Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!»
    private static void names(String name) {
        System.out.println("Привет " + name);
    }

    //Задание 5.*Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    private static void years(int currentYear) {
        if (currentYear % 4 == 0 && currentYear % 400 == 0 && currentYear % 100 == 0) {
            System.out.println(currentYear + " год високосный");
        } else if (currentYear % 4 == 0 && currentYear % 100 != 0) {
            System.out.println(currentYear + " год високосный");
        } else
            System.out.println(currentYear + " год не високосный");

    }

}
