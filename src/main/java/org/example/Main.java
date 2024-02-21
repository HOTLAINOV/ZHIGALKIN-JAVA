package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Заданный массив целых чисел
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Чётные числа:");

        // Перебор элементов массива
        for (int number : numbers) {
            // Проверка, является ли число чётным
            if (number % 2 == 0) {
                // Вывод чётного числа в консоль
                System.out.println(number);
            }
        }
    }
}