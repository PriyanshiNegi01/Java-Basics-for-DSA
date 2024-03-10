package com.priyanshi.Strings;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        System.out.println(50);

        Integer num = new Integer(55);
        // wrapper class (to use all the OOP principles with integer values)
        // Integers are primitives.
        // Primitives are stored in STACK memory and OBJECTS are stored in HEAP memory.
        System.out.println(num.toString());

        System.out.println("Priyanshi");
        System.out.println(Arrays.toString(new int[] {2, 3, 4, 5})); // function overriding
        // since it is not using the default function

        // 'out' is a variable of type PrintStream,
        // PrintStream is a class which has a method in it called as println

        String name = null;
        System.out.println(name);
    }
}
