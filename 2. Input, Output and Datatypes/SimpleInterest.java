package com.priyanshi;

// 5. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount (P): ");
        float P = sc.nextFloat();
        System.out.print("Enter the time in years (T): ");
        float T = sc.nextFloat();
        System.out.print("Enter the rate of interest (R): ");
        float R = sc.nextFloat();

        sc.close();

        // Calculate simple interest
        float simpleInterest = (P * T * R) / 100;

        System.out.println("Principal: " + P);
        System.out.println("Time: " + T + " years");
        System.out.println("Rate: " + R + "%");
        System.out.println("Simple Interest: " + simpleInterest);
    }
}