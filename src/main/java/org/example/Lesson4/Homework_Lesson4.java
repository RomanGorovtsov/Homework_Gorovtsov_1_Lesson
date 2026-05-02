package org.example.Lesson4;

import java.util.Scanner;

public class Homework_Lesson4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] words = new String[5];

        System.out.println("Введите 5 строк:");
        for (int i = 0; i < words.length; i++) {
            String input = in.nextLine();
            words[i] = input.equalsIgnoreCase("NULL") ? "XX" : input;
        }
        System.out.println("Расшифрованное послание: " + String.join("#", words));
    }
}
