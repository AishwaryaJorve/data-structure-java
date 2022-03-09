package com.aish.DSA._02Arrays;

/**
 * @author Aishwarya Jorve
 * Binary Search Using while loop
 */
public class _01BinarySearchItterative {
    static int lower=0;
    static int high;
    static int mid;
    public static void main(String[] args) {
        int[] a={4,7,9,10,11,14,17,20,22,24,27,29,35,38,39};
        high=a.length-1;
        long start = System.nanoTime();
        int index=binarySearch(a,lower,high,27);
        long end = System.nanoTime();
        System.out.println(index+" Within time "+(end-start)+" nano seconds");
    }

    static int binarySearch(int[] a,int lower,int high,int key){
         while(lower<=high){
             mid=(lower+high)/2;
             if(key==a[mid])
                 return mid;
             else if(key>a[mid])
                 lower=mid+1;
             else
                 high=mid-1;
        }
         return -1;
    }
}
