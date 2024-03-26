package com.leetCodeQns;

// 268. Missing Number
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1}; //{0,1}
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length; // [0,9]
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int i : nums) {
            arraySum = arraySum + i;
        }
        return totalSum - arraySum;
    }
}