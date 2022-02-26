package com.aish.DSA._01recursion;

public class _04PowerOfNumber {
    public static void main(String[] args) {
        _04PowerOfNumber p=new _04PowerOfNumber();
        int result=p.pow(2,9);
        System.out.println(result);
    }
    static int pow(int m,int n){
        if(n==0)
            return 1;
        else{
            return pow(m,n-1)*m;

        }


    }
}
