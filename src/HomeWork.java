
public class HomeWork {

    public static void main (String[] args){

        Employee employee1 = new Employee("Васильев Игорь Петрович", 29000, 35);
        Employee employee2 = new Employee("Лисицин Евгений Владимирович",38000,46);
        Employee employee3 = new Employee("Носов Максим Сергеевич", 32000, 40);
        Employee employee4 = new Employee("Стариков Семён Васильевич", 35000, 24);
        Employee employee5 = new Employee("Харитонов Антон Юрьевич", 39000, 50);

//Задание 4. Вывести при помощи методов из пункта 3 ФИО и возраст.
        System.out.println("ФИО " + employee1.getFullName() + ", Возраст " + employee1.getAge());



//Задание 5.Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        Employee [] array = {employee1, employee2, employee3, employee4, employee5};
        sortAge(array);

//Задание 6.* Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
        salaryUp(array);

        System.out.println("Cреднее арифметическое зарплат = " + averageSalary(array));
        System.out.println("Cреднее арифметическое возраста = " + averageAge(array));

        System.out.println(employee1.getIndexNumber() + " " + employee2.getIndexNumber() + " " + employee3.getIndexNumber() + " " + employee4.getIndexNumber() + " " + employee5.getIndexNumber() );

    }
    //Задание 5.
    private static void sortAge( Employee [] array){
        for(int i = 0; i < array.length; i++){
            if(array[i].getAge() > 40){
                System.out.println("ФИО: " + array[i].getFullName() + ", Возраст: " + array[i].getAge() + ", Зарплата: " + array[i].getSalary());
            }
        }
    }

//Задание 6.
    private static void salaryUp (Employee [] array){
        for( int i = 0; i < array.length; i++){
            if (array[i].getAge() > 45) {
                int currentSalary = array[i].getSalary();
                array[i].setSalary(currentSalary + 5000);
            }
        }
    }

    //Задание 7.
    private static int averageSalary(Employee [] array){
            int average = 0;
            for (int i = 0; i < array.length; i++){
               average += array[i].getSalary();
            }
            return average / array.length;
    }

    //Задание 7.
    private static int averageAge (Employee [] array){
        int average = 0;
        for (int i = 0; i < array.length; i++){
            average += array[i].getAge();
        }
        return average / array.length;
    }

}
