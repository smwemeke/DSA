package com.leetCodeQns;

//287. Find the Duplicate Number
public class DuplicateNumber {
    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2};
        System.out.println(duplicate(nums));

    }
    public static int duplicate(int [] nums){
        int n = nums.length-1;
        int totalSum = n * (n+1)/2;

        int arraySum = 0;

        for(int i= 0; i<nums.length;i++){
            arraySum+=nums[i];
        }
        return  arraySum - totalSum;
    }
}