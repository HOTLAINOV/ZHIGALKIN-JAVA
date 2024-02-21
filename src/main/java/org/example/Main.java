package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод двух строк с клавиатуры
        System.out.println("Введите первую строку:");
        String a = scanner.nextLine();
        System.out.println("Введите вторую строку:");
        String b = scanner.nextLine();

        // Сравнение строк и вывод результата в консоль
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}