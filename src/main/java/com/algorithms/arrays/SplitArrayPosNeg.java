package com.algorithms.arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Given an array full of integers positive or negative, write a method to move every negative number
 * to the left and every positive number to the right. Take into account that the order of these
 * elements among the same group(positive or negative) into the array doesn't care.
 * <p>
 * Input: [1,2,3,-1,-2,-3] Output: [-2,-1,-3,2,3,1]
 *
 * @author Pedro Vicente Gómez Sánchez.
 * @developer Judit Jiménez Jiménez
 */
public class SplitArrayPosNeg {

    public Integer[] splitArrayPosNeg(Integer[] array) {
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(array));
        Collections.sort(result);

        return result.toArray(new Integer[0]);
    }

}
