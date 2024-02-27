package com.priyanshi.InputOutput;

import java.util.Scanner;

// 1. Type Conversion (Widening)
// 2. Type Casting (Narrowing)
// 3. Automatic Type Promotion

public class TypeConversion {

    public static void main(String[] args) {
        // WIDENING or AUTOMATIC TYPE CONVERSION: when one type of data is assigned to another type of variable and automatic type conversion takes place
        // Two data types are automatically converted
        // Conditions for Type Conversion:
        // 1. The two data types must be compatible
        // 2. The Destination type should be greater than the Source type i.e. LHS should be greater
        // (i.e. when we assign value of smaller data type to bigger data type)
        // byte --> short --> int --> long --> float --> double

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a floating number: ");
        float n1 = input.nextFloat();
        System.out.println(n1);

        System.out.print("Enter an integer: ");
        float n2 = input.nextInt(); // automatic type conversion from integer to float
        System.out.println(n2);
    }
}
