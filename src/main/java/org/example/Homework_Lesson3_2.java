package org.example;

public class Homework_Lesson3_2 {
    public static void main(String[] args) {

        String[] passwords = {"qwerty54321", "vesna2026", "originalpassword123"};
        checkThePassword(passwords);
    }

    static void checkThePassword(String[] strings){
        for(String password: strings){
            boolean isPasswordValid = (password.length()>8
                    && !password.startsWith("1")
                    && !password.endsWith("z")
                    && !password.contains("1234")
                    && !password.toLowerCase().contains("qwerty"));
            System.out.println("пароль "+ password + " прошел проверку: " + isPasswordValid);
        }
    }
}
