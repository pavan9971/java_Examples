package org.example;

import java.util.HashSet;
import java.util.Set;

public class ArrayVerification {
    public static void main(String[] args) {
        int[] arr1 = {};
        int[] arr2 = {
        };

        Set<Integer> set1 = new HashSet<Integer>();
        for (int i : arr1) {
            set1.add(i);
        }

        Set<Integer> set2 = new HashSet<Integer>();
        for (int i : arr2) {
            set2.add(i);
        }

        if (set1.containsAll(set2)) {
            System.out.println("The second array is present in the first array.");
        } else {
            System.out.println("The second array is not present in the first array.");
        }
    }
}
