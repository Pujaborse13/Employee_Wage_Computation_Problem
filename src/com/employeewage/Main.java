package com.employeewage;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee wage Computation Program");

        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOURS = 8;
        final int PART_TIME_HOURS = 4;

        Random random = new Random();
        int employeeType = random.nextInt(3);

        if (employeeType == 1) {
            int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
            System.out.println("Employee is Full Time");
            System.out.println("Daily Wage: $" + dailyWage);
        } else if (employeeType == 2) {
            int dailyWage = WAGE_PER_HOUR * PART_TIME_HOURS;
            System.out.println("Employee is Part-Time");
            System.out.println("Daily Wage: $" + dailyWage);

        } else {
            System.out.println("Employee is Absent");
            System.out.println("Daily Wage: $0");
        }


    }
}