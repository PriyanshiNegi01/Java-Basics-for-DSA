package com.priyanshi.Strings;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        dice("", 4);
        System.out.println(diceRet("", 4));
    }

    // to simulate the rolling of a fair six-sided die and find all possible combinations of outcomes that
    // sum up to the given target
    static void dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i); // concatenation
            // when you use the + operator with a string and another data type (integer i), the integer is implicitly
            // converted to a string, and the two strings are concatenated.
        }
    }

    // Returning output as an ArrayList
    static ArrayList<String> diceRet(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // ans for this particular call
        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceRet(p + i, target - i)); // concatenation
            // whatever answer you get, just do add all
        }
        return list;
    }

    static void diceCustomFace(String p, int target, int face) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= face && i <= target; i++) {
            diceCustomFace(p + i, target - i, face); // concatenation
        }
    }

    static ArrayList<String> diceCustomFaceRet(String p, int target, int face) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // ans for this particular call
        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= face && i <= target; i++) {
            list.addAll(diceCustomFaceRet(p + i, target - i, face)); // concatenation
            // whatever answer you get, just do add all
        }
        return list;
    }
}
