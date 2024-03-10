package com.priyanshi.Strings;

import java.sql.SQLOutput;

public class Comparison {
    public static void main(String[] args) {
        // We use the below method as we want to create a string pool
        String a = "Prisha";
        String b = "Prisha";
        String c = a;
        // We know that the string is in the string pool before the value is same
        // ==
        System.out.println(a == b); // true
        System.out.println(a == c); // true

        String name1 = new String("Riya");
        String name2 = new String("Riya");
        // Even though the value is same, it may be pointing to the different object because it's explicitly mentioned
        System.out.println(name1 == name2); // false

        // To COMPARE THE VALUES ONLY
        System.out.println(name1.equals(name2));  // true
    }
}
