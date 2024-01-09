package com.priyanshi;

public class PatternsMain {
    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
        pattern3(5);
    }

    static void pattern1(int n) {
        // *****
        // *****
        // *****
        // *****
        // *****
        for (int row = 1; row <= n; row++){
            // for every row, run the column
            for (int col = 1; col <= n; col++){
                System.out.print("*");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern2(int n) {
        // *
        // **
        // ***
        // ****
        // *****
        for (int row = 1; row <= n; row++){
            // for every row, run the column
            // here, no. of rows = no. of columns
            for (int col = 1; col <= row; col++){
                System.out.print("*");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern3(int n) {
        // *****
        // ****
        // ***
        // **
        // *
        for (int row = 1; row <= n; row++){
            // for every row, run the column
            for (int col = 1; col <= n + 1 - row; col++){
                System.out.print("*");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }
}
