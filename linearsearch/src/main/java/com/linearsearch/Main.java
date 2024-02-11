package com.linearsearch;

public class Main {
    public static void main(String[] args) {
        int [] arr = {3,16,30,65,12, 40,50,29,25};
        int element = 16;
        int ans = linearSearch(arr, element);
        System.out.println("Index is: " + ans);

        System.out.println(" " );

        int ans2 = linearSearch2(arr, element);
        System.out.println("Element is: " + ans2);
    }
    // search the in the array: return the index if item found
    // otherwise return -1 if item not found
    static int linearSearch (int arr [], int target){
        if (arr.length == 0){
            return -1;
        }
//        // check for element at every index if it is = target
        for (int index = 0; index < arr.length; index++){
            if (arr[index] == target){
                return index;
            }
        }
        // if none of the return statements above have executed and target value has not been found
        return -1;
    }
    // return element itself instead of index
    static  int linearSearch2(int [] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        // using enhanced for loop
        for (int element : arr){
            if (element == target){
                return element;
            }
        }
        return -1;
    }

    // return true or false itself instead of index
    static  boolean linearSearch3(int [] arr, int target){
        if (arr.length == 0){
            return false;
        }
        // using enhanced for loop
        for (int element : arr){
            if (element == target){
                return true;
            }
        }
        return false;
    }
}
