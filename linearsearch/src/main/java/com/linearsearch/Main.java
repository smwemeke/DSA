package com.linearsearch;

public class Main {
    public static void main(String[] args) {
        int [] arr = {3,16,30,65,12, 40,50,29,25};
        int target = 40;
        int ans = linearSearch(arr, target);
        System.out.println("Index is: " + ans);

    }
    // search the in the array: return the index if item found
    // otherwise return -1 if item not found
    static int linearSearch (int arr [], int target){
        // check for element at every index if it is = target
        if (arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++){
            if (arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}
