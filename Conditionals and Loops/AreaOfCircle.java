package com.priyanshi.ConditionalsAndLoops;

import java.util.Scanner;

// Java program to find the area of a circle

public class AreaOfCircle {

    public static void main(String[] args) {

        float r;
        double pi = 3.14, area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        r = sc.nextFloat();
        area = pi*r*r;
        System.out.println("Area of circle: " + area);
    }
}
