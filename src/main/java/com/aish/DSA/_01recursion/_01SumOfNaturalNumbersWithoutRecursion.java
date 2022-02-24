package com.aish.DSA._01recursion;

public class _01SumOfNaturalNumbersWithoutRecursion {

    public static void main(String[] args) {
        int result = sum(5);
        System.out.println("result: " + result);
    }

    public static int sum(int n) {
        return n * (n + 1) / 2;
    }
}