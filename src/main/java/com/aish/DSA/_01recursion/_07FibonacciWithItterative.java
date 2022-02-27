package com.aish.DSA._01recursion;


/**
 * @author Aishwarya Jorve
 */

public class _07FibonacciWithItterative {

//    main function
    public static void main(String[] args) {
        int  result=fibItterative(10);
        System.out.println("Result is "+result);
    }

//    fibonacci series function uisng for loop
    static int fibItterative(int n){
        int t0=0;
        int t1=1;
        int s=0;

        for(int i=2;i<=n;i++){
            s=t0+t1;
            t0=t1;
            t1=s;
        }
        return s;
    }

}
