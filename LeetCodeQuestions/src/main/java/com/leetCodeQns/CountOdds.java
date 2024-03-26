package com.leetCodeQns;

public class CountOdds {

    public static void main(String[] args) {
//         int low = 3;
//         int high = 7;
        System.out.println(countOdds(8,10));
    }

    public static int countOdds(int low, int high){
        int count = 0;
        for(int i= low; i<=high;i++){
            if(i%2!=0){
                count++;
            }
        }
        return count;
    }
}
