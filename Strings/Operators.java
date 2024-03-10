package com.priyanshi.Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // when + used with char: the '+' operator is converting them into their ASCII value and adding them
        System.out.println("a" + "b"); // when + used with strings: the strings are concatenated
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1);
        // After a few steps, it is the same as "a" + "1"
        // integer will be converted to Integer that will call toString()

        System.out.println("Priyanshi" + new ArrayList<>());
        System.out.println("Priyanshi" + new Integer(51));

        String ans = new Integer(51) + "" + new ArrayList<>();
        System.out.println(ans);
        // at least one of the values should be a string to avoid error with complex objects
    }
}
