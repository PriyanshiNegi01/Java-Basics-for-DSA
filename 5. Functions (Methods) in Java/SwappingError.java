package com.priyanshi.Methods;

public class SwappingError {

    public static void main(String[] args) {
        String name = "Priya";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String naam) {

        naam = "Prisha"; // not changing, but creating a new object
        // Also, you cannot modify strings. They are immutable.
    }

    // The code is NOT SWAPPING. Why??
    /*
        Explanation:

        name --> Priya
        naam --> Priya

        // After function call
        naam --> Prisha

        Therefore, when we print 'name' again, 'Priya' is printed.

        NO PASS BY REFERENCE IN JAVA, ONLY PASS BY VALUE.
        In terms of objects (non-primitives), the copy of reference variable is passed
     */

    /*
        PRIMITIVES: int, short, char, byte,... --> Just passing value

        OBJECTS AND STUFF:                     --> Passing value of the reference variable
            For example: Both name and naam are reference variables pointing to the same object.
            If you make a change via one reference variable, original value will be changed.
            // ChangeValue code
     */
}
