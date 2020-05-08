package com.algorithms.arrays;

import java.util.Collections;
import java.util.HashSet;

/**
 * Given an array full of integers, can you write a method returning other array without duplicated
 * elements? The elements order doesn't care. For example:
 * <p>
 * Input: [1,2,3,1] Output: [1,2,3]
 * Input: [1,1,1,1,1] Output: [1]
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
public class RemoveDuplicates {

    public static void main(String[] args) {

        Integer[] firstArray = new Integer[]{1, 3, 4, 1, 3};
        Integer[] secondArray = new Integer[]{1, 2, 4, 5};

        HashSet<Integer> deleted = deleteDuplicated(firstArray);
        firstArray = deleted.toArray(new Integer[0]);

        for (Integer elemento : firstArray) {
            System.out.println(elemento);
        }

        HashSet<Integer> deleted2 = deleteDuplicated(secondArray);
        secondArray = deleted2.toArray(new Integer[0]);

        for (Integer elemento : secondArray) {
            System.out.println(elemento);
        }
    }

    private static HashSet<Integer> deleteDuplicated(Integer[] firstArray) {
        HashSet<Integer> withoutDuplicated = new HashSet<>();
        Collections.addAll(withoutDuplicated, firstArray);
        return withoutDuplicated;
    }
}


