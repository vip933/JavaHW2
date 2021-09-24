package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Tuple tup = new Tuple(false, 0);
        int choice = -1;
        while (!tup.first) {
            System.out.println("Введите 1, если вы хотите перевести фаренгейты в цельсии, 2 если наоборот.");
            System.out.print("Ваш выбор: ");
            tup = TryParseInt(scan.nextLine());
            choice = tup.second;

            // Проверка на корректность ввода.
            if (!tup.first || choice < 1 || choice > 2) {
                System.out.println("Некорректный ввод, введите либо 1, либо 2!");
            }
        }
        System.out.print("Введите число градусов: ");
        double degrees = scan.nextDouble();
        // Выбор что куда хотим переводить.
        switch (choice) {
            case 1 -> degrees = FromFahrenheitToCelsius(degrees);
            case 2 -> degrees = FromCelsiusToFahrenheit(degrees);
        }
        System.out.println("Ответ: " + new DecimalFormat("#0.000").format(degrees) + " градусов!");
    }

    // Парсинг строки в int переменную.
    private static Tuple TryParseInt(String value) {
        try {
            return new Tuple(true, Integer.parseInt(value));
        } catch (NumberFormatException e) {
            return new Tuple(false, 0);
        }
    }

    // Перевод из фаренгейтов в цельсии.
    private static double FromFahrenheitToCelsius(double degrees) {
        return 5.0 / 9.0 * (degrees - 32);
    }

    // Перевод из цельсиев в фаренгейты.
    private  static  double FromCelsiusToFahrenheit(double degrees) {
        return  9.0 / 5 * degrees + 32;
    }
}
