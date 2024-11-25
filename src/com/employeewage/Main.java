package com.employeewage;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee wage Computation Program");

        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOURS = 8;
        final int PART_TIME_HOURS = 4;

        final int   IS_ABSENT=0;
        final int  IS_FULL_TIME=1;
        final int   IS_PART_TIME=2;


        Random random = new Random();
        int employeeType = random.nextInt(3);

        int dailyWage =0;

        switch(employeeType)
        {
            case IS_FULL_TIME:
                dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
                System.out.println("Employee is Full-Time");
                break;
            case IS_PART_TIME:
                dailyWage = WAGE_PER_HOUR * PART_TIME_HOURS;
                System.out.println("Employee is Part-Time");
                break;

            case IS_ABSENT:
                System.out.println("Employee is Absent");
                break;

            default:
                System.out.println("Invalid Employee Type");


        }
        System.out.println("Daily Wage: $" + dailyWage);


    }
}