package com.aish.DSA._02Arrays;

/**
 *  @Author Aishwarya Jorve
 *  Using Recursion implemented Binary Search Algoritham
 */

public class _02BinarySearchWithRecursion {
    static int low=0;
    static int high;
    static int mid;
    static int a[]={4,7,9,10,11,14,17,20,22,24,27,29,35,38,39};
    public static void main(String[] args) {

        high=a.length-1;
        long start = System.nanoTime();
        int result=binarySearchWithRecursion(high,low,14);
        long end = System.nanoTime();
        System.out.println(result+" Within time "+(end-start)+" nano seconds");
    }

    /**
     *
     * @param high
     * @param low
     * @param key
     * @return index of key in Array in 'mid' variable
     */
    private static int binarySearchWithRecursion(int high,int low,int key) {
        if(low<=high){
            mid=(low+high)/2;
            if(key==a[mid])
                return mid;
            else if(key>a[mid])
                return binarySearchWithRecursion(high,mid+1,key);
            else
                return binarySearchWithRecursion(mid-1,low,key);
        }
        return -1;
    }
}
