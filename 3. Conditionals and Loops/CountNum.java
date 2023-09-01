package com.priyanshi;

public class CountNum {

    public static void main(String[] args) {
        // to find the occurrences of a digit in a given number
        int n = 455365;

        int count = 0; // initialize the occurrences of the number as 0
        while (n > 0) {
            int rem = n % 10; // last digit
            if (rem == 5) {
                count++;
            }
            n = n / 10; // n /= 10
        }
        System.out.println(count);
    }
}
