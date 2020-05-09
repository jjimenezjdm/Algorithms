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
 * @developer Judit Jiménez Jiménez
 */
public class RemoveDuplicates {

    public Integer[] removeDuplicates(Integer[] array) {

        HashSet<Integer> deleted = deleteDuplicated(array);
        array = deleted.toArray(new Integer[0]);

        for (Integer elemento : array) {
            System.out.println(elemento);
        }

        return array;
    }

    private static HashSet<Integer> deleteDuplicated(Integer[] firstArray) {
        HashSet<Integer> withoutDuplicated = new HashSet<>();
        Collections.addAll(withoutDuplicated, firstArray);
        return withoutDuplicated;
    }
}


