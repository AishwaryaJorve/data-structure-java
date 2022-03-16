package com.aish.DSA._01recursion;

/**
 * @author Aishwarya Jorve
 */

public class _05ToylorSeriesWithRecursion {

         //    Variable declaration
         static int p = 1;
         static int f = 1;
         static int r = 0;


         public static void main(String[] args) {
	        int r1 = eque(4, 10);
	        System.out.println(r1);
         }

         //    ToylorSeries method
         static int eque(int x, int n) {
	        if (n == 0) {
		       System.out.println("If run");
		       return 1;
	        }

	        r = eque(x, n - 1);
	        p = p * x;
	        f = f * n;
	        return r + p / f;
         }
}
