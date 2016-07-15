package geekbrains.java_1.lesson_2;
/**
 * Домашнее задание по курсу: * Java 1 - Урок 2 - Задание 5
 * Задать одномерный массив и найти в нем минимальный и максимальный элементы;
 * Created by xxx on 14.07.2016.
 */
public class HomeWork25 {
    public static void main(String[] args){
        int[] mas = { 2, 5, 3, 2, 11, 4, 5, 1, 4, 8, 9, 3 };
        int min = mas[0];
        int max = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) max = mas[i];
            if (mas[i] < min) min = mas[i];
        }
        System.out.println("Минимальное - " + min + ", Максимальное - " + max);
        }
    }
