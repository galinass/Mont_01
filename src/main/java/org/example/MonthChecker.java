package org.example;

import java.util.Scanner;

public class MonthChecker {
    public static void main(String[] args) {
        // Създаваме Scanner обект за четене от конзолата
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на число
        System.out.print("Enter a number from 1 to 12: ");
        int monthNumber = scanner.nextInt();

        // Определяне на месеца
        String month = getMonthName(monthNumber);

        // Извеждане на резултата
        System.out.println(month);

        // Затваряме Scanner обекта
        scanner.close();
    }

    // Метод за връщане на името на месеца на базата на число
    public static String getMonthName(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "January\n";
            case 2:
                return "February\n";
            case 3:
                return "March\n";
            case 4:
                return "April\n";
            case 5:
                return "May\n";
            case 6:
                return "June\n";
            case 7:
                return "July\n";
            case 8:
                return "August\n";
            case 9:
                return "September\n";
            case 10:
                return "October\n";
            case 11:
                return "November\n";
            case 12:
                return "December\n";
            default:
                return "There is no month!";
        }
    }
}
