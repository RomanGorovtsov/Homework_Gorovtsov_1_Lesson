package org.example.Lesson4;

public class Homework_Lesson4_2 {

    static int criticalCount = 0;
    static int flakyCount = 0;
    static int bugCount = 0;
    static int passCount = 0;

    static boolean showOnlyIssues = false;
    static boolean checkCriticalBugsFlag = false;


    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                if (checkCriticalBugsFlag && criticalCount>2){
                    System.out.println("Слишком много критических багов - будим тимлида!");
                    break;
                }
                System.out.printf("Тест #%d: Critical!\n", i);
                criticalCount++;
            } else if (i % 3 == 0) {
                System.out.printf("Тест #%d: Flaky\n", i);
                flakyCount++;
            } else if (i % 5 == 0) {
                System.out.printf("Тест #%d: Bug\n", i);
                bugCount++;
            } else {
                passCount++;
                if (showOnlyIssues) {
                    System.out.printf("Тест #%d: Pass!\n", i);
                }
            }
        }
        int totalProcessed = passCount + flakyCount + bugCount + criticalCount;


        System.out.printf("\n--- ИТОГИ НОЧНОЙ СМЕНЫ ---" +
                "\nВсего тестов: " + totalProcessed +
                "\nPass: " + passCount +
                "\nFlaky: " + flakyCount +
                "\nBug: " + bugCount +
                "\nCritical: " + criticalCount
        );
    }
}
