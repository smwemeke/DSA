package com.leetCodeQns;
//1523. Count Odd Numbers in an Interval Range

public class CountOdds {

    public static void main(String[] args) {

        System.out.println(countOdds(0,1000000000));
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
