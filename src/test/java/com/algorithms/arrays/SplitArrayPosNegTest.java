package com.algorithms.arrays;


import org.junit.Assert;
import org.junit.Test;

/**
 * Given an array full of integers positive or negative, write a method to move every negative number
 * to the left and every positive number to the right. Take into account that the order of these
 * elements among the same group(positive or negative) into the array doesn't care.
 * <p>
 * Input: [1,2,3,-1,-2,-3] Output: [-2,-1,-3,2,3,1]
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
public class SplitArrayPosNegTest {

    SplitArrayPosNeg splitArrayPosNeg = new SplitArrayPosNeg();

    @Test
    public void splitArrayTest() {
        Integer[] firstArray = new Integer[]{1, -3, -4, 4, 6, -7};
        Integer[] result = new Integer[]{-7, -4, -3, 1, 4, 6};
        Assert.assertArrayEquals(result, splitArrayPosNeg.splitArrayPosNeg(firstArray));
    }

    @Test
    public void splitArrayWithZeros() {
        Integer[] firstArray = new Integer[]{1, 0, 3, 4, 6};
        Integer[] result = new Integer[]{0, 1, 3, 4, 6};
        Assert.assertArrayEquals(result, splitArrayPosNeg.splitArrayPosNeg(firstArray));
    }

}
