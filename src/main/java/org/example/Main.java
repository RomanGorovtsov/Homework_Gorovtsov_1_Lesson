package org.example;

public class Main {
    public static void main(String[] args) {

        String name = "Роман";
        String jobTitle = "Шаурмичный QA-инженер";
        int ratePerShift = 8000;
        int countOfShifts = 21;
        int awardCont = 10000;
        int fineForBurntLavash = 3000;
        int priceOfKebab = 560;
        int countOfSolvedKebabs = 900;

        getAllData(name, jobTitle, ratePerShift, countOfShifts, awardCont, fineForBurntLavash, priceOfKebab, countOfSolvedKebabs);
    }

    public static void getAllData(String name, String jobTitle, int ratePerShift, int countOfShifts, int awardCont, int fineForBurntLavash, int priceOfKebab, int countOfSolvedKebabs) {
        int baseSalary = countOfShifts * ratePerShift;
        int totalSalary = baseSalary + awardCont - fineForBurntLavash;
        int totalRevenue = priceOfKebab * countOfSolvedKebabs;

        System.out.printf("""
                Сотрудник: %s
                Должность: %s
                Оплата за смены: %d
                Премия: %d
                Штраф: %d
                Итоговая зарплата: %d
                Шаур-выручка: %d
                """, name, jobTitle, baseSalary, awardCont, fineForBurntLavash, totalSalary, totalRevenue);
    }
}
