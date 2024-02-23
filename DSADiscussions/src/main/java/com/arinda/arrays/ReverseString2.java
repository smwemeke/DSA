package com.arinda.arrays;

import java.util.ArrayList;

public class ReverseString2 {
    public static void main(String[] args) {
        String str = "Sue";
        StringBuilder str2 = new StringBuilder();
        ArrayList<Character> list = new ArrayList<>();

        for(char ch : str.toCharArray()){
          list.add(ch);
        }
        for(char c : list){
            str2.insert(0, c);
        }
        System.out.println(str2);
    }
}
