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

        public static String validateQuantityInput(Scanner scanner) {
            while (!scanner.hasNextInt()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.print("Введите количество!: ");
            }
            String quantity = scanner.nextInt();
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

        public static String validatesInput(Scanner scanner) {
            while (!scanner.hasNextDouble()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.print("Введите цену!: ");
            }
            String price = scanner.nextDouble();
            while (price <= 0) {
                System.out.print("Неверное значение! Введите цену: ");
                while (!scanner.hasNextDouble()) {
                    String str = scanner.nextLine().trim();
                    System.out.printf("\"%s\" - не число!\n", str);
                    System.out.print("Введите цену!: ");
                }
                price = scanner.nextDouble();
            }
            return price;
        }
    }

