package geekbrains.java_1.lesson_5;
/**
 * 1. Создать несколько классов:
 *    Собака, Лошадь, Кот - с наследованием от родительского класса Животное.
 * 2. Все классы должны иметь возможность выполнять действия:
 *    бежать, плыть, перепрыгивать препятствие.
 * 3. У каждого класса свои ограничения на каждое из действий
 *    (например, высота прыжка, собака может перепрыгнуть максимум полуметровое препятствие,
 *    кот 1-2 метровое; считаем, что коты не умеют плавать и т.д.).
 *    Каждое действие должно выводить результат в консоль
 *    (смогло животное выполнить действие или нет).
 * Created by dragser on 22.07.2016.
 */
import geekbrains.java_1.lesson_5.animals.Animal;
import geekbrains.java_1.lesson_5.animals.Cat;
import geekbrains.java_1.lesson_5.animals.Dog;
import geekbrains.java_1.lesson_5.animals.Horse;

import java.util.Scanner;


public class MainClass {

    private static final int ANIMALS_COUNT = 3;
    private int speed;
    private String swim;
    private int jump;


    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        Animal[] animals = new Animal[ANIMALS_COUNT];
        animals[0] = new Cat("Кошка");
        animals[1] = new Dog("Собака");
        animals[2] = new Horse("Лошадь");

        int speed;    //Скорость бега
        String swim;    // Плавает ли животное
        int jump;     // Высота прыжка

        System.out.println("ЗооТест");

        System.out.println("С какой максимальной скоростью (км/ч) может бежать лошадь?");
        System.out.print(">> ");
        while (true) {
            String speed_str = input.next();
            try {
                speed = new Integer(speed_str);
                break;
            }catch (NumberFormatException e) {
                System.err.println("Неверный формат числа!");
            }
        }

        System.out.println("Плавает ли кошка? (Y/N)");
        while (true) {
            swim = input.next();
            swim = swim.toUpperCase();
            if (swim.equals("Y") || swim.equals("N")) {
                break;
            }else{
                System.out.println("Введите Y или N");
            }
        }

        System.out.println("На какую высоту (м) прыгает собака?");
//        jump = input.nextInt();

        while(true) {
            String jump_str = input.next();
            try {
                jump = new Integer(jump_str);
                break;
            }catch (NumberFormatException e) {
                System.err.println("Неверный формат числа!");
            }
        }

        System.out.println("-------------------------------------");
        System.out.println("Правильные ответы:");
        animals[2].moveOnGround(speed);
        System.out.println();
        animals[0].swim(swim);
        System.out.println();
        animals[1].jump(jump);

        input.close();
    }
}