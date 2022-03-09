package com.aish.DSA._02Arrays;
/*
  @Author Aishwarya Jorve
 * What is the Difference between Contains and binarySearch method of collections
 */

import java.util.ArrayList;
import java.util.Collections;

/**
 * Java provides two methods namely Collections.binarySearch() and contains() to find an element inside a list. Underneath the hood, contains() method uses indexOf() method to search for the element.
 * indexOf() method linearly loops through the List and compares every element with the key until the key is found and returns true otherwise it returns false when the element is not found.
 * so, the time complexity of contains() is O(n). The time complexity of Collections.binarySearch() is O(log2(n)). But if we want to use this method then the list should be sorted.
 * If the list is not sorted then we need to sort it before using Collections.binarySearch() which takes O(nlog(n)) time.
 */
// Documentation Link here https://www.geeksforgeeks.org/binary-search-vs-contains-performance-in-java-list/

public class _03ContainsVSBinarySearchWidUnsorted {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        // Iterating between 0 to 100000 numbers
        for (int i = 0; i < 100000; i++) {
            // Random numbers that will not be sorted
            int rand = (int) (Math.random() * 100000);
            arr.add(rand);
        }

        int key = arr.get(30000);

        // Using contains Method
        long start = System.nanoTime();
        arr.contains(key);
        long end = System.nanoTime();

        System.out.println("Time takes to find " + key + " inside arr using contains() = " + (end - start) + " nano seconds");

        // Using binarySearch Method
        start = System.nanoTime();
        Collections.sort(arr);
        Collections.binarySearch(arr, key);
        end = System.nanoTime();

        System.out.println("Time takes to find " + key + " inside arr using binarySearch() = " + (end - start) + " nano seconds");
    }
}
