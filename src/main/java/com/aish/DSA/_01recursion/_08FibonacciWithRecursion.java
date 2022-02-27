package com.aish.DSA._01recursion;

public class _08FibonacciWithRecursion {

    //    main function
    public static void main(String[] args) {
        int  result=fibRecursive(10);
        System.out.println("Result is "+result);
        System.out.println("Hyeee Pull me I am from remote");
    }

    //    fibonacci series function uisng for loop
    static int fibRecursive(int n){
        if(n<=1)
            return n;
        return fibRecursive(n-2)+fibRecursive(n-1);
    }
}