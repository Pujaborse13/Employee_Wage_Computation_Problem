package com.employeewage;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee wage Computation Program");

        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOURS = 8;
        final int PART_TIME_HOURS = 4;
        final int WORKING_DAYS_LIMIT = 20;
        final int WORKING_HOURS_LIMIT = 100;

        int totalWage = 0;
        int totalHoursWorked = 0;
        int totalWorkingDays = 0;


        while (totalWorkingDays < WORKING_DAYS_LIMIT && totalHoursWorked < WORKING_HOURS_LIMIT) {
            totalWorkingDays++;

            int dailyHours = getWorkingHours();
            totalHoursWorked += dailyHours;
            if (totalHoursWorked > WORKING_HOURS_LIMIT) {
                totalHoursWorked -= dailyHours;
                break;
            }

            int dailyWage = dailyHours * WAGE_PER_HOUR;
            totalWage += dailyWage;
            System.out.println("Day " + totalWorkingDays + ": Worked " + dailyHours + " hours, Earned: " + dailyWage);
    }

        System.out.println("\nTotal Working Days: " + totalWorkingDays);
        System.out.println("Total Hours Worked: " + totalHoursWorked);
        System.out.println("Total Wage for the Month: " + totalWage);
    }

    public static int getWorkingHours() {
        int empCheck = (int) (Math.random() * 3); // Random value: 0, 1, or 2
        switch (empCheck) {
            case 1: return 8;
            case 2: return 4;
            default: return 0;



        }
    }


    }