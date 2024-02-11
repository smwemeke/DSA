package com.linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        int [] arr = {18,12,-7,3,14,28};
        int target = 23;
        int result = search(arr, target, 1,4);
        System.out.println(result);

    }

    static int search (int [] arr, int target, int start, int end){
        if (arr.length == 0)
            return -1;
        for (int index = start; index <= end; index++){
            int element = arr[index];
            if (element == target){
                return element;
            }
        }
        return -1;
    }
}
