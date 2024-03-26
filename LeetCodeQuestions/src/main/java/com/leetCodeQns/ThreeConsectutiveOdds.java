package com.leetCodeQns;
//1550. Three Consecutive Odds

public class ThreeConsectutiveOdds {

    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 1};

        int[] arr1 = {1, 2, 34, 3, 4, 5, 7, 23, 12};

        int[] arr2 = {1, 2, 1,1};

        System.out.println(threeOdd(arr));

        System.out.println(threeOdd(arr1));

        System.out.println(threeOdd(arr2));

        System.out.println("Using Count");

        System.out.println(threeOdds(arr));

        System.out.println(threeOdds(arr1));

        System.out.println(threeOdds(arr2));
    }

    public static boolean threeOdd(int[] arr) {
        if (arr.length < 3) return false;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
                return true;
            }
        }
        return false;
    }
    public static boolean threeOdds(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            } else if (arr[i] % 2 == 0) {
                count = 0;
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }
}
