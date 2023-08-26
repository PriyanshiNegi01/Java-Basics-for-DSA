package com.priyanshi;

import java.util.Scanner;

// 1. Sum of 2 numbers

public class Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First number: ");
        float num1 = sc.nextFloat();
        System.out.print("Second number: ");
        float num2 = sc.nextFloat();

        // Type Conversion and Casting
        // float can take integer values as well but int cannot take float values

        float sum = num1 + num2;

        System.out.println("Sum: " + sum);
    }
}
