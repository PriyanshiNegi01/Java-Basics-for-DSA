package com.priyanshi;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Check whether a single number is Armstrong or not
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//        boolean ans = isArmstrong(n);
//        System.out.println(ans);

        // Print all the 3-digit Armstrong numbers
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

    }

    static boolean isArmstrong(int n) {
         int original = n; // to compare the result with original number at the end
         int sum = 0;

         while (n > 0) {
             int rem = n % 10;
             n = n / 10;
             sum = sum + rem*rem*rem;
         }

        return sum == original; // returns true or false
    }

}
