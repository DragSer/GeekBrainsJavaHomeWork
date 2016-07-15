package geekbrains.java_1.lesson_2;
import java.util.Scanner;
/**
 * Домашнее задание по курсу: * Java 1 - Урок 2 - Задание 6
 * Написать простой консольный калькулятор.
 * Пользователь вводит два числа и операцию которую хочет выполнить, программа вычисляет результат и выводит в консоль;
 * Created by xxx on 14.07.2016.
 */
public class HomeWork26 {
    private static Scanner input;
    public static void main(String[] args){
        input = new Scanner(System.in);

        double number1;
        double number2;
        String operator;

        System.out.println("Калькулятор");
        System.out.println("Введите через пробел: число1, операция(+, -, *, /), число2");
        System.out.print(">> ");

        number1 = input.nextDouble();
        operator = input.next();
        number2 = input.nextDouble();

        if (operator.equals("+")) System.out.print("= " + (number1 + number2));
        if (operator.equals("-")) System.out.print("= " + (number1 - number2));
        if (operator.equals("*")) System.out.print("= " + (number1 * number2));
        if (operator.equals("/")) System.out.print("= " + (number1 / number2));
    }
}