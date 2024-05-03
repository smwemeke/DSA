package com.kunal.conditionsandloops;

import java.util.Scanner;
//Find largest number of thre 3 numbers entered by user
public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max1 = a;
        if (b > max1) {
            max1 = b;
        }
        if (c > max1) {
            max1 = c;
        }
        System.out.println("Using If-Statement: " + max1);

        // Approach 2
        int max = Math.max(c, Math.max(a, b));
        System.out.println("Using Mathematical Approach: " + max);
    }
}