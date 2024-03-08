package com.priyanshi.Switch;

import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a fruit: ");
        String fruit = sc.next();
        // '==' checks the reference of string, if the reference is different but the value is same, it may return false.
        // '.equals' function checks the value of object, the reference may or may not be the same.

        // Switch  statements

        /*
        Syntax:

        switch (expression){
            // cases
            case one:
                // do something
                break;
            case two:
                // do something
                break;
            default:
                // do something

        }
         */

        // NOTE
        // 1. Cases have to be the same type as expressions, must be a constant or literal
        // 2. Duplicate case values are not allowed
        // 3. Break is used to terminate the sequence
        // 4. If break is not used, it will continue to next case
        // 5. Default will be executed when none of the above cases gets executed
        // 6. If default is not placed at the end, put break after it

        // Shortcut key 'alt + enter': To replace switch statement with enhanced switch statement or if-else statements

        // Enhanced switch
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Please enter a valid fruit");
        }
        // No break statement is required in the 'enhanced' switch statement
    }
}