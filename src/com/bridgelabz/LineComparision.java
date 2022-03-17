package com.bridgelabz;

import java.util.Scanner;

public class LineComparision {

    static void equals(Integer lenght1, Integer lenght2){
        boolean result = lenght1.equals(lenght2);
        if (result ==true)
            System.out.println("Length of lines is same");
        else
            System.out.println("Lines are not equals...");
    }
    static void compare(Integer length1,Integer length2){
        int result = length1.compareTo(length2);
        if(result>0)
            System.out.println("Line One is greater :");
        else if(result<0)
            System.out.println("Line two is greater : ");
        else
            System.out.println("Both lines are Equal...");
    }
    public static void main(String[] args) {

        int x1 = 2;  int y1 = 3;
        int x2 = 6;  int y2 = 4;
        Integer length1 = (int)Math.sqrt((x2-x1)*2 + (y2-y1)*2);
        System.out.println("Length of 1st line is : "+length1);
        int p1 = 3;  int q1 = 4;
        int p2 = 7;  int q2 = 1;
        Integer length2 = (int)Math.sqrt((p2-p1)*2 + (q2-q1)*2);
        System.out.println("Length of second line is : "+length2);
        equals(length1,length2);
        compare(length1,length2);
    }
}
