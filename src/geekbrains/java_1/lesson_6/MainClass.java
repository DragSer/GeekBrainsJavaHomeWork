package geekbrains.java_1.lesson_6;

/**
 * 1. Создать 2 текстовых файла, примерно по 50-100
 * символов в каждом(особого значения не имеет);
 * 2. Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла,
 * потом текст из второго.
 * 3. * Написать программу, которая проверяет присутствует ли указанное пользователем слово
 * в файле.
 * Created by Dragunov_S on 01.08.2016.
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MainClass {
    private static String file_name;    // Имя файла
    private static String text;         // Техт
    private static int num_text;        // Количество повторений переменной text

    public static void main(String args[]) throws IOException {
        System.out.println("Задание 1"); // Создаем два текстовых файла
        file_name = "e:/JAVA/PROJECTS/java_home_works/src/geekbrains/java_1/lesson_6/lesson6_1.txt";
        text = "1 файл\n";
        num_text = 5;
        FileWorker.write(file_name, text, num_text);
        String file_name1 = file_name;
        System.out.println("Создан файл " + file_name1);

        file_name = "e:/JAVA/PROJECTS/java_home_works/src/geekbrains/java_1/lesson_6/lesson6_2.txt";
        text = "2 файл\n";
        num_text = 10;
        FileWorker.write(file_name, text, num_text);
        System.out.println("Создан файл " + file_name);

        System.out.println("\nЗадание 2"); // Подкливаем к первому файлу содержимое второго и произвольную строку
        PrintStream out = new PrintStream(new FileOutputStream(file_name1, true), true);
        List<String> lines = Files.readAllLines(Paths.get(file_name), StandardCharsets.UTF_8);
        for(String line: lines) {
            out.println(line);
        }
        out.println("Склеено Java! )");
        out.close();
        System.out.println("К файлу\n" + file_name1 + "\nприклеен файл\n" + file_name);

        System.out.println("\nЗадание 3"); // Проверяем наличие слова
        String search_text = "Java!";
        long start_time = System.nanoTime();
        FileWorker.find_text(file_name1, search_text);
        float delta_time = (System.nanoTime() - start_time)*0.000001f;
        System.out.println("за " + Math.round(delta_time) + " ms");
    }
}