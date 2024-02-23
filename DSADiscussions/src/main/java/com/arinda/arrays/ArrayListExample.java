package com.arinda.arrays;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Arinda");
        list.add("Ethan");
        list.add("Esther");
        list.add("Hansel");
//        list.add(45);
        System.out.println(list);
        System.out.println(" ");
        System.out.println(list.contains("Ethan"));

//        list.set(1, 50);
//        list.add(78);
//        list.set(2, 70);
//        list.add(1,60);
//        System.out.println(list);

       // list.remove(1);
        list.remove("Arinda");

        System.out.println(list);

    }
}
