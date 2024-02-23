package com.arinda.arrays;

import java.util.LinkedList;

public class ReverseString {

    public static void main(String[] args) {
        String str = "arinda";
        String revStr = new String();
        LinkedList<Character> list = new LinkedList<>();



        for(int i=0; i<str.length();i++){
            list.push(str.charAt(i)); // pushing each character into stack
        }
        System.out.println("List " + list);
        System.out.println("List size " + list.size());
        for (int j =0; j<str.length();j++){
            revStr = revStr + list.pop();
            System.out.println(list);
            System.out.println(list.size());
        }
        System.out.println(revStr);
    }
}