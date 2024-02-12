package com.linearsearch;

public class FindMinAndMax {
    public static void main(String[] args) {
        int [] arr = {12, 4, -2, 5 ,9,34};
        System.out.println(searchMin(arr));

        System.out.println(searchMax(arr));
    }

    static int searchMin (int[] arr){
        if (arr.length == 0)
            return -1;
        int ans = arr[0];
        for (int i =1; i<arr.length;i++){
            if (arr[i] < ans)
                ans = arr[i];
        }
        return   ans;
    }

    static int searchMax(int [] arr){
        if (arr.length == 0)
            return -1;
        int ans = arr[0];
        for (int max : arr){
            if (max > ans){
                ans = max;
            }
        }
        return ans;
    }
}