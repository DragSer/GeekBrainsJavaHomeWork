package geekbrains.java_1.lesson_1;

/**
 * Домашнее задание по курсу: * Java 1 - Урок 1 - Задание 4
 * Написать метод, принимающий на вход два числа,
 * и проверяющий что их сумма лежит в пределах 10 до 20,
 * если да – вернуть true, в противном случае – false.
 * Created by xxx on 09.07.2016.
 */
public class HomeWork14 {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        int c = a + b;

        System.out.println("Для значения = " + c + " условие " + find(c));
    }

    private static boolean find(int c) {
        boolean x = false;
        if (c >= 10 & c <= 20 ) {
            x = true;
        }
        return x;
    }
}
