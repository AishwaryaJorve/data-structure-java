package com.aish.DSA._01recursion;

public class _02SumOfNaturalNumbers {
    public static void main(String[] args) {
           int result=sum(5);
           System.out.println(result);
    }

    public static int sum(int n){
        if(n==0){
            return 0;
        }
        else{
            return sum(n-1)+n;
        }
    }
}
