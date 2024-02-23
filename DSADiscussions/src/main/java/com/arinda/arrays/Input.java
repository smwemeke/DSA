package com.arinda.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter elements: ");
        String [] arr = new String[3];
        // Input
        for(int i =0;i<arr.length;i++){
            arr[i] = in.next();

        }
        // Output
        for(int i =0; i<arr.length;i++){
            System.out.println(arr[i]);

        }
        System.out.println(Arrays.toString(arr));

    }
}
