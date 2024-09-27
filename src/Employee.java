public class Employee {
    private String fullName;
    private int salary;
    private int age;
    private int indexNumber;
    private static int allIndexNumber = 1;

    Employee(String fullName, int salary, int age){
        this.fullName = fullName;
        this.salary = salary;
        this.age = age;
        this.indexNumber = allIndexNumber;
        allIndexNumber++;
    }

    public String getFullName (){
        return fullName;
    }


    public int getSalary (){
        return salary;
    }

    public void setSalary (int salary){
        this.salary = salary;
    }

    public int getAge(){
        return age;
    }

    public int getIndexNumber(){
        return indexNumber;
    }
}
