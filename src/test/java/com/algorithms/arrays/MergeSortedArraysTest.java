package com.algorithms.arrays;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortedArraysTest {

    @Test
    public void mergeSortedArraysTest() {
        Integer[] firstArray = new Integer[]{1, 3, 4, 4, 6, 7};
        Integer[] secondArray = new Integer[]{1, 2, 4, 5, 8, 10, 21};

        Integer[] firstArraySorted = new Integer[]{1, 1, 2, 3, 4, 4, 4, 5, 6, 7, 8, 10, 21};
        MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();
        Integer[] resultSorted = mergeSortedArrays.mergeSortedArrays(firstArray, secondArray);

        Assert.assertArrayEquals(firstArraySorted, resultSorted);
    }

    @Test
    public void mergeSortedArraysSameArrayTest() {
        Integer[] firstArray = new Integer[]{1, 1, 1};
        Integer[] secondArray = new Integer[]{1, 1, 1};

        Integer[] firstArraySorted = new Integer[]{1, 1, 1, 1, 1, 1};
        MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();
        Integer[] resultSorted = mergeSortedArrays.mergeSortedArrays(firstArray, secondArray);

        Assert.assertArrayEquals(firstArraySorted, resultSorted);
    }
}
