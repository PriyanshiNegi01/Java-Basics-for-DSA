package com.priyanshi;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) { // main function is the first function that runs
        Scanner input = new Scanner(System.in); // creating an object of 'Scanner' class

        System.out.print("Please enter some integer input: ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is " + rollno);

        int a = 10;
        // literal: In Primitive data types, literals are the syntactical representation of boolean, character, numeric...data types
        // a-->identifier(reference variable), 10-->literal
        // identifier: refers to the name of a variable, method, class, packages or other things like interfaces in Java
        System.out.println(a + " is an integer");

        System.out.print("In Java, 234_000_000 refers to: ");
        int b = 234_000_000; // We can use underscores instead of commas when dealing with large numbers
        System.out.println(b);

        System.out.print("Please enter an input string: ");
        String nameWord = input.next(); // next(): to get the first word only
        System.out.println(nameWord);

        // Consume the newline character left in the buffer

        input.nextLine();

        /* By adding 'input.nextLine()'; after 'input.next();',
        you're ensuring that any leftover newline character is consumed before you read the next line of input.
        This prevents unexpected behavior and ensures that your program works as intended. */

        System.out.print("Please enter an input string: ");
        String name = input.nextLine(); // nextLine(): to get the entire line
        System.out.println(name);

        System.out.print("Enter a float value: ");
        float marks = input.nextFloat();
        System.out.println(marks);

        input.close(); // Close the 'Scanner' object using 'input.close();' at the end of your program to release any associated resources.
    }
}
