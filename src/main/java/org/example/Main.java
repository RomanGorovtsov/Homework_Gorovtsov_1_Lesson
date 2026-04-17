package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int age = random.nextInt(80);
        double bankAccountSum = random.nextDouble() * 100000;

        boolean moreThan18 = age>18;
        boolean hasInvitation = true;
        boolean inBlackList = false;

        boolean prohodit = moreThan18 && (hasInvitation || bankAccountSum > 50000) && !inBlackList;
        System.out.println(prohodit);
        System.out.println("Обязательный добровольный взнос " + (int) bankAccountSum * 0.075);
    }
}
