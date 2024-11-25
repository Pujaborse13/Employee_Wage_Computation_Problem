package com.employeewage;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee wage Computation Program");

        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOURS =8;


        Random random = new Random();
        int attendance = random.nextInt(2);

        if(attendance == 1 )
        {
            int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
            System.out.println("Employee is Present");
            System.out.println("Daily Wage: $" + dailyWage);
        } else {
            System.out.println("Employee is Absent");

                }


          }
    }