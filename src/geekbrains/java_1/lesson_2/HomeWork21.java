package geekbrains.java_1.lesson_2;
/**
 * Домашнее задание по курсу: * Java 1 - Урок 2 - Задание 1
 * Создать массив состоящий из элементов 0 и 1, например int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
 * Created by xxx on 12.07.2016.
 */
public class HomeWork21 {
    public static void main(String[] args){
        int[] arr21 = { 0, 0, 1, 1, 1, 0, 0};

        for (int i = 0; i < arr21.length; i++) {
            System.out.print(arr21[i]+" ");
        }
    }
}