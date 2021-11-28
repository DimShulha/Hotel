package utils;

import java.util.Scanner;


    public class Validator {
    public static String validateName(Scanner scanner) {
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
        System.out.print("Пусто! Введите имя: ");
        str = scanner.nextLine().trim();
        }
        return str;
        }


    public static int validateQuantityInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
        String str = scanner.nextLine().trim();
        System.out.printf("\"%s\" - не число!\n", str);
        System.out.print("Введите количество!: ");
        }
        int quantity = scanner.nextInt();
        while (quantity <= 0) {
        System.out.println("Неверное значение! Введите количество: ");
        while (!scanner.hasNextInt()) {
        String str = scanner.next().trim();
        System.out.printf("\"%s\" - не число!\n", str);
        System.out.println("Введите количество!: ");
        }
        quantity = scanner.nextInt();
        }
        return quantity;
        }


    public static double validatesInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
        String str = scanner.nextLine().trim();
        System.out.printf("\"%s\" - не число!\n", str);
        System.out.print("Введите число!: ");
        }
        double star = scanner.nextDouble();
        while (star >= 1.6) {
        System.out.print("Неверное значение! Введите число в формате 1, до 1,5 включительно: ");
        while (!scanner.hasNextDouble()) {
        String str = scanner.nextLine().trim();
        System.out.printf("\"%s\" - не число!\n", str);
        System.out.print("Введите число в формате 1, до 1,5 включительно: ");
        }
        star = scanner.nextDouble();
        }
        return (double) star;
        }
        }
