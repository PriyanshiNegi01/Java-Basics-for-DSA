package com.priyanshi;

public class Conditionals {

    public static void main(String[] args) {

        // 1. Single if-else statement

        /*
            Syntax:
            if (boolean expression T or F) {
                // body
            } else {
                // do this
            }
         */

        int salary = 25400;

//        if (salary > 10000) {
//            salary = salary + 2000;
//        } else {
//            salary = salary + 1000;
//        }

        // 2. Multiple if-else statements: It executes one condition from multiple statements
        /*
            Syntax:

            if (condition 1) {
                // body
            } else if (condition 2) {
                // body
            } else {
                // body
            }
         */

        if (salary > 10000) {
            salary += 2000; // salary = salary + 2000
        } else if (salary > 20000) {
            salary += 3000;
        } else {
            salary += 1000;
        }

        System.out.println(salary);

        // if MULTIPLE CONDITIONS (AND: &&) need to be true

        /*
        int a = 10;
        int b = 20;

        if (a == 10 && b == 20) { // true
            System.out.println("Hello World");
        }
         */

        // if ANY ONE CONDITION (OR: ||) need to be true

        /*
        int a = 10;
        int b = 40;

        if (a == 10 || b == 20) { // true
            System.out.println("Hello World");
        }
        */

        // not equal to (!=)

        /*
        int a = 10;
        int b = 40;

        if (a != 35) { //true
            System.out.println("Hello World");
        }
         */

    }
}