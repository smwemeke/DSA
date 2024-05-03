package com.kunal.conditionsandloops;

public class Conditionals {
    public   static void main(String[] args) {
        int salary = 1000;
        if (salary > 10000) {
            salary += 1000;
        } else if (salary > 15000) {
            salary += 2000;
        } else {
            salary += 3000;
        }
        System.out.println(salary);
    }
}
