package com.priyanshi;

import java.util.Scanner;

public class CaseCheck {

    public static void main(String[] args) {
        // Alphabet case check (lowercase/uppercase)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().trim().charAt(0);

        // next() gets the next word.
        // trim() removes all the extra spaces before the word.
        // charAt(0) gives the character at the 0th (given) index of a string.
        // Index starts at 0.

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
    }
}
