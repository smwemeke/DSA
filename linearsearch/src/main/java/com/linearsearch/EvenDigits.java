package com.linearsearch;

// Leetcode Question: Given an array nums of integers, return how many of them contain an even number of digits
// (Find number of numbers that have even number of digits)

public class EvenDigits {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896, 4523};
        System.out.println(findNumbers(nums));

        System.out.println("Number of digits: " + digits(-4523));

        System.out.println("Number of digits: " + digits2(-4500123));

    }
    static int findNumbers(int [] nums){
        int count = 0;
        for(int n : nums)
            if(even(n)){
                count++;
            }
        return count;

        }
    // function to check if number contains even digits
        static boolean even(int num){
          int numberOfDigits = digits(num);
          /*
          if ( numberOfDigits % 2 == 0){
                 return true;
          }
          return false;
           */
              return numberOfDigits % 2 == 0;
        }
    // count number of digits in a number

    static int digits2(int num){
        if (num < 0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
    return (int)(Math.log10(num)) + 1;
    }
    static int digits(int num){
        if (num < 0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        int count = 0;
        while (num >0){
            count++;
            num = num/10;
        }
        return count;
    }
    }


