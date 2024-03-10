package com.priyanshi.Methods;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Overloading {
    // Function Overloading: Two or more functions of the same name can exist if:
    // 1. The TYPE OF ARGUMENTS are different.
    // 2. Same type of argument but DIFFERENT NUMBER OF ARGUMENTS.
    public static void main(String[] args) {
        // In function overloading, the function to be run is determined at COMPILE TIME.
        fun(55);
        fun("Priyanshi");
        int ans = sum(2, 3);
        System.out.println("The sum is = " + ans);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }
    static void fun(int a) {
        System.out.println("First one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}
