package geekbrains.java_1.lesson_2;
/**
 * Домашнее задание по курсу: * Java 1 - Урок 2 - Задание 4
 * Задать массив int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
 * пройти по нему циклом, и числа которые меньше 6 умножить на 2.
 * Created by xxx on 13.07.2016.
 */
public class HomeWork24 {
    public static void main(String[] args) {
        int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < mas.length; i++) {
            if (mas [i] < 6) { mas [i] *= 2; }
            System.out.print(mas[i] + " ");
        }
    }
}