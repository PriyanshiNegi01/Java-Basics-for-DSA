package com.priyanshi;

public class PassingExample {
    // In Java there is no pass by reference, there is ONLY PASS BY VALUE
    public static void main(String[] args) {
        String name = "Priyanshi";
        greet(name); // value of the reference variable is passed
    }

    static void greet(String naam) { // a copy of the reference variable (naam) is passed i.e. it will point to the same object as 'name' in this case
        System.out.println(naam);
    }

}
