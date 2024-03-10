package com.priyanshi.Methods;

public class Shadowing {
    // SHADOWING in Java is a practice of using two variables with the same name within the scope that overlaps.
    // Static: object independent. You can't use object dependent things in object independent things.
    static int x = 100; // this will be shadowed at line 11
    // Anything which you are using inside main() should be static.
    public static void main(String[] args) {
        System.out.println(x); // 100 (value of class variable x)
        int x; // declaration of local variable // the class variable at line 6 is shadowed by this
        // Shadowing begins after the declaration of the local variable
//        System.out.println(x); // Scope of local variable will begin when it is initialized
        x = 40; // initialization
        System.out.println(x); // 40 // The variable with the higher level scope is hidden.
        fun(); // 100 // Shadowing effect does not take place in methods
    }

    static void fun() {
        System.out.println(x);
    }
}
