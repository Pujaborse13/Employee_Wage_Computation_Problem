package com.employeewage;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee wage Computation Program");

        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOURS = 8;
        final int PART_TIME_HOURS = 4;
        final int WORKING_DAYS_PER_MONTH = 20;

        int totalWage = 0;

        for (int day = 1; day <= WORKING_DAYS_PER_MONTH; day++) {
            int dailyHours = getWorkingHours();
            int dailyWage = dailyHours * WAGE_PER_HOUR;
            totalWage += dailyWage;
            System.out.println("Day " + day + ": Worked " + dailyHours + " hours, Earned: $" + dailyWage);
        }

        System.out.println("Total Wage for the Month: $" + totalWage);
    }
    public static int getWorkingHours() {
        int empCheck = (int) (Math.random() * 3);
        switch (empCheck) {
            case 1: return 8;
            case 2: return 4;
            default: return 0;
              }

        }


    }