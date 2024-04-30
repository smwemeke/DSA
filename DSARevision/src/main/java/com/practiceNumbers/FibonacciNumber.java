package com.practiceNumbers;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibo(n));

    }
    public static int fibo(int num){
        // base
        if(num <=1){
            return num;
        }
        return fibo(num -1) + fibo(num-2);
    }
}