package com.priyanshi;

public class Primitives {

    public static void main(String[] args) {
        int rollno = 64; // 4 bytes
        char letter = 'r';
        float marks = 12.21f; // 4 bytes - f is written since all decimal values are in the form of double by default
        double largeDecimalNumbers = 1234567.8989; // 8 bytes
        long largeInteger = 123456789123456789L; // 8 bytes - L is written since a number is assumed to be of the integer form by default
        boolean check = true;

        // Primitive: Any datatype that you cannot break any further is known as a Primitive.
        // String is not primitive.
        // Everything that starts with a capital letter is a class.

        Integer rno = 64; // Wrapper class - to have some additional functionalities to the Primitives
        //Eg: rno.function_name

        String word = "Hello";
        if (word instanceof String) { // instanceof: to check type of the object.
            // Primitive types themselves are not objects, so 'instanceof' doesn't apply to them.
            System.out.println("'word' variable is of type String");
        } else {
            System.out.println("Letter variable is of an unknown type");
        }
    }
}