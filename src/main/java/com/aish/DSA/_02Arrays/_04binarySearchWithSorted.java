package com.aish.DSA._02Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class _04binarySearchWithSorted {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            arr.add(i);
        }

        long start = System.nanoTime();
        arr.contains(40000); // Contains Method
        long end = System.nanoTime();
        System.out.println("Time taken to find 40000 inside arr " + "using contains() = " + (end - start) + " nano seconds");

        start = System.nanoTime();
        Collections.binarySearch(arr, 40000);  // binarySearch Method
        end = System.nanoTime();

        System.out.println("Time taken to find 40000 inside arr " + "using binarySearch() = " + (end - start) + " nano seconds");
    }
}

/*
  OUTPUT
  Time taken to find 40000 inside arr using contains() = 2188182 nano seconds
  Time taken to find 40000 inside arr using binarySearch() = 44752 nano seconds
 */