package com.priyanshi;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        // LOOP: Used to iterate a part of program several times.

        // 1. for loop: Used when WE KNOW how many times the loop will iterate.

        /*
            Syntax:

            for (initialisation; condition; increment/decrement) {
                // body
            }
         */

        // Q: Print numbers from 1 to 5
//        for (int num = 1; num <= 5;num += 1) {
//            System.out.println(num);
//        }

        // Print numbers from 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.println("For loop");
        System.out.print("Enter a number: ");
        int n1 = sc.nextInt();

        for (int num = 1; num <= n1;num += 1) {
            System.out.print(num + " ");
        }

        // 2. while loop: Used when WE DON'T KNOW how many times the loop will iterate.
        // Entry controlled loop

        /*
            Syntax:

            while (condition) {
                // body
                // increment/decrement
            }
         */
        System.out.println();
        System.out.println("While loop");

        // Q: Print numbers from 1 to 5
        int n2 = 1; // initialisation
        while(n2 <= 5) { // condition
            System.out.println(n2); // body
            n2 += 1; // increment/decrement
        }

        // 3. do while: The loop is going to run at least once.
        // Exit controlled loop
        // First it will execute the body and then check the condition.

        /*
            Syntax:

            do {
                // body
            } while (condition);

         */
        System.out.println("Do while loop");

        int n3 = 1;
        do {
            System.out.println(n3);
            n3++;
        } while (n3 <=5);

    }
}
