package geekbrains.java_1.lesson_1;

/**
 * Домашнее задание по курсу: * Java 1 - Урок 1 - Задание 3
 * Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
 *  где a,b,c,d – входные параметры этого метода.
 * Created by xxx on 09.07.2016.
 */
public class HomeWork13 {
    public static void main(String[] args){
        int a = 5;
        int b = 2;
        int c = 4;
        int d = 2;

        System.out.println("a * (b + (c / d)) = " + calc(a, b, c, d));
    }
    private static int calc (int a, int b, int c, int d){
        return a * (b + (c / d));
    }
}
