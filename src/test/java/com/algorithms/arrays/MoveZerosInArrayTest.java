package com.algorithms.arrays;

import org.junit.Assert;
import org.junit.Test;


public class MoveZerosInArrayTest {

    @Test
    public void moveZerosInArrayTest() {
        int[] firstArray = new int[]{1, 2, 0, 4, 5, 6};
        MoveZerosInArray moveZerosInArray = new MoveZerosInArray();
        int[] result = new int[]{1, 2, 4, 5, 6, 0};

        Assert.assertArrayEquals(result, moveZerosInArray.moveZerosInArray(firstArray));

    }


    @Test
    public void moveZerosInArrayWithZerosTest() {
        int[] secondArray = new int[]{0, 0, 0, 4, 0, 6};
        MoveZerosInArray moveZerosInArray = new MoveZerosInArray();
        int[] result = new int[]{4, 6, 0, 0, 0, 0};

        Assert.assertArrayEquals(result, moveZerosInArray.moveZerosInArray(secondArray));

    }
}
