package geekbrains.java_1.lesson_4;

public class MainClass extends Employee{
    public MainClass(String name, String position, String email, String phone, int salary, int age) {
        super(name, position, email, phone, salary, age);
    }

    public static void main(String[] args) {
        Employee[] empl = new Employee[5];
        empl[0] = new Employee("Иванов", "Насяльник", "bos@mail.ru", "100-00-01", 100000, 50);
        empl[1] = new Employee("Петров", "Бухгалтер", "pet@mail.ru", "100-00-02", 90000, 25);
        empl[2] = new Employee("Сидоров", "Слесарь 1", "sid@mail.ru", "100-00-03", 80000, 41);
        empl[3] = new Employee("Бородач", "Охранник", "bor@mail.ru", "100-00-04", 30000, 35);
        empl[4] = new Employee("Джамшут", "Грузчик 1", "gru@mail.ru", "100-00-05", 30000, 43);

        int employee_count = Employee.getEmployee_count();
        System.out.println("Общее Количество сотрудников = " + employee_count);
        System.out.println("Из них сотрудники старше 40 лет:");
        for (int i = 0; i < empl.length; i++) {
            if (empl[i].getAge() >= 40) empl[i].printInfo();
        }
    }




}