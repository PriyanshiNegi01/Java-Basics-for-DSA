package com.priyanshi;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false; // not prime
            }
            c++;
        }
        return c * c > n;
        /*
            The above line is the same as:
            if (c * c > n) {
                return true;
            }
            return false;
         */
    }
}
