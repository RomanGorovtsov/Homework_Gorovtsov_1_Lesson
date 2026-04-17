package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int age = random.nextInt(80);
        double bankAccountSum = random.nextDouble() * 100000;

        boolean hasInvitation = true;
        boolean inBlackList = false;

        boolean moreThan17 = age >= 18;
        boolean inviteValid = hasInvitation || bankAccountSum > 50000;

        boolean prohod = moreThan17 && inviteValid && !inBlackList;
        System.out.println(prohod);
        if (prohod) {
            System.out.println("Обязательный добровольный взнос " + (int) (bankAccountSum * 0.075));
        }
    }
}
