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
     * https://github.com/pedrovgs/Algorithms
     */

    public Integer[] mergeSortedArrays(Integer[] firstArray, Integer[] secondArray) {

        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(Arrays.asList(firstArray));
        result.addAll(Arrays.asList(secondArray));
        Collections.sort(result);
        System.out.println(result.toString());

        return result.toArray(new Integer[0]);
    }
}
