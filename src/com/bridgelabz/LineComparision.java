package com.bridgelabz;

import java.util.Scanner;

public class LineComparision {

    static void lengthCalculate(double x1,double y1,double x2,double y2){
        double length = Math.sqrt((x2-x1)*2 + (y2-y1)*2);
        System.out.println(length);

    }

    public static void main(String[] args) {

        double x1;
        double y1;
        double x2;
        double y2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First point x1 :");
        x1 = scanner.nextInt();
        System.out.println("Enter Second point y1 :");
        x2 = scanner.nextInt();
        System.out.println("Enter third point x2 :");
        y1 = scanner.nextInt();
        System.out.println("Enter Fourth point y2 :");
        y2 = scanner.nextInt();
        lengthCalculate(x1,x2,y1,y2);
    }
}
