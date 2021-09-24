package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	    System.out.println("Введите на следующей строке строку, которую хотите проверить!");
        CheckLetters(scan.nextLine());
    }

    private static void CheckLetters(String str) {
        final String consonantsRussian = "йцкнгшщзхфвпрлджбтмсч";
        final String consonantsEnglish = "qwrtplkjhgfdszxcvbnm";
        final String vowelRussian = "аеёуоиюыэя";
        final String vowelEnglish = "aeiuyo";

        int vowelsCounter = 0;
        int consonantsCounter = 0;
        var arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            // Поиск английских согласных.
            if (consonantsEnglish.indexOf(Character.toLowerCase(arr[i])) != -1) {
                consonantsCounter++;
                // Поиск русских согласных.
            } else if (consonantsRussian.indexOf(Character.toLowerCase(arr[i])) != -1) {
                consonantsCounter++;
                // Поиск английских гласных.
            } else if (vowelEnglish.indexOf(Character.toLowerCase(arr[i])) != -1) {
                vowelsCounter++;
                // Поиск русских гласных.
            } else  if (vowelRussian.indexOf(Character.toLowerCase(arr[i])) != -1) {
                vowelsCounter++;
            }
        }

        System.out.println("Количество гласных: " + vowelsCounter);
        System.out.println("Количество сограсных: " + consonantsCounter);
    }
}
