package com.algorithms.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeSortedArrays {
    /**
     * Given two already sorted arrays full of integers, write a method to merge it into other and keep
     * the sorting.
     *
     * @author Pedro Vicente Gómez Sánchez.
     */

    public static void main(String[] args) {

        Integer[] firstArray = new Integer[]{1, 3, 4, 4, 6, 7};
        Integer[] secondArray = new Integer[]{1, 2, 4, 5, 8, 10, 21};

        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(Arrays.asList(firstArray));
        result.addAll(Arrays.asList(secondArray));
        Collections.sort(result);
        System.out.println(result.toString());
    }
}
