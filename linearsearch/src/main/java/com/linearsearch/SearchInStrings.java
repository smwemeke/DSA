package com.linearsearch;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String str = "Alvron";
        char target = 'o';
        System.out.println(searchString(str, target));

        System.out.println(Arrays.toString(str.toCharArray()));

        System.out.println(searchString2(str, target));


    }
    // Search for character in a string
    static  boolean searchString2(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for (char ch : str.toCharArray()){
                return true;
            }
        return false;
        }

    static  boolean searchString(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for (int i=0; i< str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
