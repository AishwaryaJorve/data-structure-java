package com.aish.DSA._01recursion;

/**
 * @author Aishwarya Jorve
 */


public class _06ToylorLessNoOfMultiplication {
//    variable declaration
    static int s=1;

//    main method
    public static void main(String[] args) {
        int result=exre(2 ,10 );
        System.out.println("result is "+result);
    }

//    function of ToylorSeries with less no of multiplication
    static int exre(int xvalue,int n){
        if(n==0)
            return s;

        s=1+xvalue*s/n;
        return exre(xvalue,n-1);
    }
}
