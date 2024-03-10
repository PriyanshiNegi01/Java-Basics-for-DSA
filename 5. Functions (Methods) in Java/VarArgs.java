package com.priyanshi.Methods;

import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        fun(); // o/p: empty array
        fun(2, 3, 4, 5, 25, 18, 50);
        multiple(2, 3, "Priya", "Prisha");
        demo(2, 3, 4);
//        demo(); // Error: ambiguity, because at compile time it will be unable to decide which function is going to run.
    }

    static void demo(int ...v) { // Function overloading
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    // When we want mix of arguments: Both Normal and Keyword arguments
    // RULE: The variable length arguments must be the last in the list of arguments
    /*
    static void multiple(int a, String ...v, int b)  { } // wrong
     */
    static void multiple(int a, int b, String ...v) { // order of arguments matter
        System.out.println(Arrays.toString(v));
    }
    // variable length arguments: length is not constant. There may be any number of inputs (0 or more).
    static void fun(int ...v) { // internally it is taking it as an array (of integers)
        System.out.println(Arrays.toString(v));
    }
}
