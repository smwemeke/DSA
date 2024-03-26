package com.leetCodeQns;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
    int [] nums = {0,1,0,3,12};
        moveZero(nums);
    }
    static void moveZero(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                int j = i + 1;
                while (j < nums.length) {
                    if (nums[j] != 0) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    } else j++;

                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
