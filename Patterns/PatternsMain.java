package com.priyanshi;

public class Patterns1 {

    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
        pattern5(5);
    }

    static void pattern5(int n){
        // n = 5
        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *
        for (int row = 1; row <= 2 * n; row++){

            int totalColsInRow = row > n ? 2 * n - row : row;
            // above explanation: if row is greater than 'n', the Cols = 2 * n - row, else, Cols = row

            // for every row, run the column
            for (int col = 1; col <= totalColsInRow; col++){
                System.out.print("* ");
            }

            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern4(int n){
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        for (int row = 1; row <= n; row++){
            // for every row, run the column
            for (int col = 1; col <= row; col++){
                System.out.print(col + " ");
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

}
