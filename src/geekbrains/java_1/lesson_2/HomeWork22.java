package geekbrains.java_1.lesson_2;
/**
 * Домашнее задание по курсу: * Java 1 - Урок 2 - Задание 2
 * В массиве из предыдущего пункта, с помощью цикла заменить 0 на 1, 1 на 0;
 * Created by xxx on 12.07.2016.
 */
public class HomeWork22 {
    public static void main(String[] args) {
        int[] arr22 = { 0, 0, 1, 1, 1, 0, 0};
        System.out.println("Исходный массив:");
        for (int i = 0; i < arr22.length; i++) {
            System.out.print(arr22[i]+" ");
        }
        System.out.println();
        System.out.println("Массив после замены:");
        for (int i = 0; i < arr22.length; i++) {
            if (arr22[i]== 0) { arr22[i] = 1;}
            else { arr22[i] = 0; }
            System.out.print(arr22[i] + " ");
        }
    }
}