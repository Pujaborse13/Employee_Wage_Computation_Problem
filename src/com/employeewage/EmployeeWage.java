package com.employeewage;
import java.util.Random;

public class EmployeeWage {

    public static void computeEmployeeWage(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
        int totalWage = 0;
        int totalHoursWorked = 0;
        int totalWorkingDays = 0;

        System.out.println("\nComputing wages for " + companyName);

        while (totalWorkingDays < maxWorkingDays && totalHoursWorked < maxWorkingHours) {
            totalWorkingDays++;

            int dailyHours = getWorkingHours();
            totalHoursWorked += dailyHours;


            if (totalHoursWorked > maxWorkingHours) {
                totalHoursWorked -= dailyHours; // Remove excess hours
                break;
            }

            int dailyWage = dailyHours * wagePerHour;
            totalWage += dailyWage;

            System.out.println("Day " + totalWorkingDays + ": Worked " + dailyHours + " hours, Earned: $" + dailyWage);
        }

        System.out.println("\n" + companyName + " - Total Working Days: " + totalWorkingDays);
        System.out.println(companyName + " - Total Hours Worked: " + totalHoursWorked);
        System.out.println(companyName + " - Total Wage for the Month: $" + totalWage);
    }

    public static int getWorkingHours() {
        int empCheck = (int) (Math.random() * 3); // Random value: 0, 1, or 2
        switch (empCheck) {
            case 1:
                return 8;
            case 2:
                return 4;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program - UC8");


        computeEmployeeWage("Company A", 20, 20, 100);
        computeEmployeeWage("Company B", 25, 22, 120);
        computeEmployeeWage("Company C", 18, 25, 110);

    }
}