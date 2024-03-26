package com.leetCodeQns;

public class SingleNumber {

    public static void main(String[] args) {
        int [] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int [] nums){
        // We shall use XOR operator
        int xorResult = 0;
        for(int n : nums){
            xorResult = xorResult ^ n;
        }
        return xorResult;
    }
}
