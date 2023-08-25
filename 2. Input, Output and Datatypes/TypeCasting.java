package com.priyanshi;

import java.util.Scanner;

// 1. Type Conversion (Widening)
// 2. Type Casting (Narrowing)
// 3. Automatic Type Promotion

public class TypeCasting {

    public static void main(String[] args) {
        // NARROWING or EXPLICIT TYPE CASTING (Not done automatically)
        // This needs to be done when we want to assign a value of larger data type to a smaller data type
        // (i.e. Compressing the bigger number in a smaller type explicitly)
        // Involves casting incompatible types
        // It is known as NARROWING CONVERSION since we are explicitly saying to narrow
        // double --> float --> long --> int --> short --> byte
        // Eg: Assigning int <-- float

        int num = (int)(21.55f); // type casting
        System.out.println(num);
    }
}
