package com.company;

public class Main {

    public static void main(String[] args) {
        int num = getRandomDoubleBetweenRange(1, 100);

        // Дебаг опция.
        //System.out.println("Случайное сгенерированное число: " + num);

        if (num % 3 == 0) {
            System.out.print("Fizz");
        }
        if (num % 5 == 0) {
            System.out.println("Buzz");
        }
        if (num % 5 != 0 && num % 3 != 0) {
            System.out.println("Число " + num + " не Fizz и не Buzz.");
        }
    }

    // Генерирует случайны числа в диапозоне [min, max].
    private static int getRandomDoubleBetweenRange(int min, int max){
        return (int)(Math.random()*((max-min)+1))+min;
    }
}
