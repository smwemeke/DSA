package com.learnArrays;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(5);
        list.add(34);
        list.add(14);
        list.add(55);
        list.add(67);
        list.add(87);

        System.out.println(list.contains(20));
        System.out.println(" ");

        System.out.println(list);
        list.set(3, 25); //3 is index of element you want to change, 25 is new value you want to set at index 3
        System.out.println(" ");
        System.out.println(list);
        System.out.println(" ");
        list.remove(1);
        System.out.println(list);
    }
}
