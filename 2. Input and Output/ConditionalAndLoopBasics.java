package com.priyanshi.InputOutput;

// syntax for conditional statements and loops

public class ConditionalAndLoopBasics {

    public static void main(String[] args) {
//        if (true) {
//            System.out.println("Hello World");
//        }
        int a = 10;
        if (a == 10) {
            System.out.println("Hello World");
        }

        // While Loop:  when you don't know how many times the loop is going to run
        int count = 1;
        while(count != 5) {
            System.out.println(count);
            count++;
        }

        // For Loop: when you know how many times the loop is going to run
        for(int i = 1; i != 5; i++) {
            System.out.println(i);
        }
    }
}
