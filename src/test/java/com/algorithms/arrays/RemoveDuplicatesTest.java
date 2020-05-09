package com.algorithms.arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Given an array full of integers, can you write a method returning other array without duplicated
 * elements? The elements order doesn't care. For example:
 * <p>
 * Input: [1,2,3,1] Output: [1,2,3]
 * Input: [1,1,1,1,1] Output: [1]
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
public class RemoveDuplicatesTest {

    RemoveDuplicates removeDuplicates = new RemoveDuplicates();

    @Test
    public void removeDuplicateTest() {

        Integer[] firstArray = new Integer[]{1, 3, 4, 1, 3};
        Integer[] result = new Integer[]{1, 3, 4};

        Assert.assertArrayEquals(result, removeDuplicates.removeDuplicates(firstArray));
    }

    @Test
    public void removeDuplicateWithoutDuplicatesTest() {
        Integer[] secondArray = new Integer[]{1, 2, 4, 5};
        Integer[] result = new Integer[]{1, 2, 4, 5};

        Assert.assertArrayEquals(result, removeDuplicates.removeDuplicates(secondArray));
    }

}


