package com.learnArrays;

public class ColNotFixed {
    public static void main(String[] args) {
        int [][] arr = {
                {2,4,6,8},
                {3,5},
                {11,13,15}
        };
        for(int row=0; row<arr.length;row++){
            for(int col=0; col<arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
