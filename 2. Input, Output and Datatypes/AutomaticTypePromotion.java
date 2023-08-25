package com.priyanshi;

// 1. Type Conversion (Widening)
// 2. Type Casting (Narrowing)
// 3. Automatic Type Promotion

public class AutomaticTypePromotion {

    static double sumOfDifferentTypes() {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // Output: float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        return result;
    }

    public static void main(String[] args) {
        // AUTOMATIC TYPE PROMOTION in Expressions
        // While evaluating expressions, the intermediate value may exceed the range of operands and hence the
        // expression value will be promoted.
        // byte/short/char --> int
        // long/float/double --> the whole expression is promoted to long/float/double
        // In the example below, 1 byte's range is 256. The max value that can be stored in a byte is 256.
        // If the max range is exceeded, then the result is the remainder of the value to be stored and the max value that we can put over there.

        int a = 257;
        byte b = (byte)(a); // 257 % 256 = 1
        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c; // the result of the intermediate term a * b easily exceeds the range of byte operator
//        // To handle this kind of problem, Java is automatically promoting each byte to integer when it is evaluating this expression
//        // This implies that the expression is performed using integers and not bytes
//
//        System.out.println(d);

        // byte b = 50;
        // b = b * 2; // error: since now you cannot assign an integer to a byte without explicitly doing the casting

        // Examples for character
        int number = 'A';
        System.out.println(number); // Automatic type conversion to the ASCII value
        // NOTE: Java follows the Unicode principles, so you can easily print any language
        System.out.println("नमस्ते");

        // Type Promotion Rules:
        // 1. All the byte short and char values are promoted to int
        // 2. If any one of the operators is long, the whole operation will be promoted to long.
        // Similarly, for float, double

        System.out.println(3 * 5.2828f);

        double result = sumOfDifferentTypes();
        System.out.println(result);
    }
}
