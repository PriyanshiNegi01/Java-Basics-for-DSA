package com.priyanshi.Methods;

import java.util.Scanner;

public class SumMethod {

    public static void main(String[] args) {

        // Q: Take an input of 2 numbers and print the sum

//        int ans = sum2();
//        System.out.println(ans);

        int ans = sum3(20, 30);
        System.out.println(ans);
    }
    // Method
    /*
        Syntax:

        access modifier return_type name(arguments) {
            // body
            return statement;
        }
     */

    // pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // return the value
    static int sum2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum; // return result

        // The statements after the return statement will never be executed as it marks the end of a function
    }

    // Alternate: return no value
//    static void sum1() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number 1: ");
//        int num1 = sc.nextInt();
//        System.out.print("Enter number 2: ");
//        int num2 = sc.nextInt();
//        int sum = num1 + num2;
//        System.out.println("The sum = " + sum); // display result
//    }
}
