package geekbrains.java_1.lesson_2;
/**
 * Домашнее задание по курсу: * Java 1 - Урок 2 - Задание 3
 * Создать массив из 8 целых чисел. С помощью цикла заполнить его значениями 1 4 7 10 13 16 19 22;
 * Created by xxx on 13.07.2016.
 */
public class HomeWork23 {
    public static void main(String[] args) {
        int[] arr23 = new int[8];
        int elementArray = 1;

        for (int i = 0; i < arr23.length; i++) {
            arr23 [i] = elementArray;
            elementArray += 3;
            System.out.print(arr23[i] + " ");
        }
    }
}