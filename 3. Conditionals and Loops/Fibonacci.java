package com.priyanshi;

import java.util.Scanner;

// Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13,...

public class Fibonacci  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0; // previous index
        int b = 1; // current index
        int count = 2;

        while (count <= n) {
             int temp = b;
             b = b + a;
             a = temp;
             count++;
        }

        System.out.println(b);
    }
}
