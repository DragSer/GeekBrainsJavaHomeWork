package geekbrains.java_1.lesson_1;

/**
 * Домашнее задание по курсу: * Java 1 - Урок 1 - Задание 5
 * Написать метод, который определяет является ли год високосным.
 * Каждый 4й год является високосным, кроме каждого 100го, при этом каждый 400й – високосный.
 * Created by xxx on 09.07.2016.
 */
public class HomeWork15 {
    public static void main(String[] args) {
        int year = 2016;

        if(vyear(year) == true) {
            System.out.println("Год " + year + " високосный.");
        } else {
            System.out.println("Год " + year + " не високосный.");
        }
    }

    private static boolean vyear(int y){
        boolean y2 = false;
        if(y%4==0 && y%100 !=0 || y%400==0) { y2 = true; }
        return y2;
    }
}
