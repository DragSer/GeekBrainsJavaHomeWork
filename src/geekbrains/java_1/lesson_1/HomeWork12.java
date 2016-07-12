package geekbrains.java_1.lesson_1;

/**
 * Домашнее задание по курсу: * Java 1 - Урок 1 - Задание 2
 * Создать переменные всех пройденных типов данных, и инициализировать их значения
 * Created by xxx on 09.07.2016.
 */
public class HomeWork12 {
    public static void main(String[] args){
        byte a = 100;
        short b = 10000;
        int c = 1000000000;
        long d = 1000000000L;
        float e = 0.1f;
        double f = 0.1;
        char g = 'X';
        boolean h = false;

        System.out.println("Примитивные типы данных:");
        System.out.println("byte    - " + a);
        System.out.println("short   - " + b);
        System.out.println("int     - " + c);
        System.out.println("long    - " + d);
        System.out.println("float   - " + e);
        System.out.println("double  - " + f);
        System.out.println("char    - " + g);
        System.out.println("boolean - " + h);
    }
}