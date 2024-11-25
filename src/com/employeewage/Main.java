package com.employeewage;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee wage Computation Program");

        Random random = new Random();
        int attendance = random.nextInt(2);

        if(attendance == 1 )
        {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }


          }
    }