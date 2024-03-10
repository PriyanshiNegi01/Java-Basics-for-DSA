package com.priyanshi.Strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Priyanshi Negi Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('i'));
        System.out.println("   Priya   ".strip()); // extra spaces at the ends are removed
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
