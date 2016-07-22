package geekbrains.java_1.lesson_4;
/**
 * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
 * 2. Конструктор класса должен заполнять эти поля при создании объекта;
 * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
 * 4. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 *  * Created by xxx on 20.07.2016.
 */
public class Employee {
    private String name;    // ФИО сотрудника
    private String position;// Должность
    private String email;   // eMail
    private String phone;   // Телефон
    private int salary;     // Зарплата
    private int age;        // Возраст
    private static int employee_count;

    public Employee(String name, String position, String email, String phone, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        employee_count++;
    }

    public static int getEmployee_count(){return employee_count; }

    public void printInfo(){
        System.out.println(name+"\t"+position+"\t"+email+"\t"+phone+"\t"+salary+"\t"+age);
    }

    public int getAge(){ return age; }

}
