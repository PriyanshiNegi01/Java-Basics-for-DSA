package com.priyanshi.Strings;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
//        permutations("", "abc");

//        ArrayList<String> ans = permutationsList("", "abc");
//        System.out.println(ans);

        System.out.println(permutationsCount("", "abcd"));
    }

    static void permutations (String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0); // first character of unprocessed (up)

        // variable no. of function calls that depends on the size of the processed (p)
        for(int i = 0; i <= p.length(); i++) {
            // substring(beg,end) --> beg is inclusive & end is exclusive
            String f = p.substring(0, i); // first substring from 0 till 1
            String s = p.substring(i, p.length()); // second substring
            // call my recursive function
            permutations(f + ch + s, up.substring(1)); // skip the first character of up for next call
        }
    }

    static ArrayList<String> permutationsList (String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0); // first character of unprocessed (up)

        // below list is local to this call
        ArrayList<String> ans = new ArrayList<>();

        // variable no. of function calls that depends on the size of the processed (p)
        for(int i = 0; i <= p.length(); i++) {
            // substring(beg,end) --> beg is inclusive & end is exclusive
            String f = p.substring(0, i); // first substring o 0 till 1
            String s = p.substring(i, p.length()); // second substring
            // call my recursive function
            ans.addAll(permutationsList(f + ch + s, up.substring(1))); // skip the first character of up for next call
        }

        return ans;
    }

    // to return the count of permutations
    static int permutationsCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0; // for this level
        char ch = up.charAt(0); // first character of unprocessed (up)

        // variable no. of function calls that depends on the size of the processed (p)
        for(int i = 0; i <= p.length(); i++) {
            // substring(beg,end) --> beg is inclusive & end is exclusive
            String f = p.substring(0, i); // first substring from 0 till 1
            String s = p.substring(i, p.length()); // second substring
            // call my recursive function
            count = count + permutationsCount(f + ch + s, up.substring(1)); // skip the first character of up for next call
        }
        return count;
    }
}
