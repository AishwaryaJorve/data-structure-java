package com.aish.DSA._01recursion;

public class _03FactorialWithRecursion {
    public static void main(String[] args) {
        int result=fact(5);
        System.out.println(result);
    }
    static int fact(int n){
         if(n==0)
             return 1;
         else {
             return fact(n - 1) * n;
         }
    }
}
