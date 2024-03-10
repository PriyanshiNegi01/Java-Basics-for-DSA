package com.priyanshi.Strings;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
//        pad("", "12");
//        System.out.println(padRet("", "12"));
        System.out.println(padRet("", "12").size()); // to verify count of the statement below
        System.out.println(padCount("", "12"));
    }

    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; // this will convert '2' into 2

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            // we are trying to add the char (= 'a' + index) to the processed
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> padRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2

        // ans for this particular call
        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            // we are trying to add the char (= 'a' + index) to the processed
            char ch = (char) ('a' + i);
            list.addAll(padRet(p + ch, up.substring(1)));
        }
        return list;
    }

    static int padCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            // we are trying to add the char (= 'a' + index) to the processed
            char ch = (char) ('a' + i);
            count = count + padCount(p + ch, up.substring(1));
        }
        return count;
    }
}
