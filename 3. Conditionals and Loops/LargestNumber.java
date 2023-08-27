package com.priyanshi;

// Q: Find the largest of the 3 numbers

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//        int max = a; // assume
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }

        // alternate approach

//        int max = 0;
//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//        }
//
//        if (c > max) {
//            max = c;
//        }

        // alternate approach

        int max = Math.max(c, Math.max(a, b)); // nested 'Math.max(a, b)' function

        System.out.println(max);
    }
}
