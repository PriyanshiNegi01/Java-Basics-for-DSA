package com.priyanshi.InputOutput;

import java.util.Scanner;

// 2. Convert temperature from Celsius to Fahrenheit

public class Temperature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter temperature in C: ");
        float tempC = sc.nextFloat();
        // temperature conversion
        float tempF = (tempC * 9/5) + 32;
        System.out.println(tempF);
    }
}