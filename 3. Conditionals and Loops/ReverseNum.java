package com.priyanshi;

public class ReverseNum {

    public static void main(String[] args) {
        // to reverse the given number
        int num = 123456;
        int ans = 0;

        while (num > 0) {
            int rem = num % 10;
            num /= 10;

            ans = ans * 10 + rem; // reversing
        }
        System.out.println(ans);
    }
}
