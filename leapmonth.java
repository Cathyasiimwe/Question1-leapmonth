package com.mycompany.month;

import java.util.Scanner;
public class leapmonth {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        System.out.println("Enter a month (1-12): ");
        int month = scanner.nextInt();

        // Check if the month is a leap month
        boolean isLeapMonth = checkLeapMonth(year, month);

        // Output the result
        if (isLeapMonth) {
            System.out.println("The month " + month + " in year " + year + " is a leap month.");
        } else {
            System.out.println("The month " + month + " in year " + year + " is not a leap month.");
        }
        
        scanner.close();
    }

    public static boolean checkLeapMonth(int year, int month) {
        // Boolean expressions to determine if it's a leap month
        boolean isLeapMonth = (year % 4 == 0);
        isLeapMonth = isLeapMonth && (month % 100 != 0);
        isLeapMonth = isLeapMonth || (month % 400 == 0);
        return isLeapMonth;
    }
}
