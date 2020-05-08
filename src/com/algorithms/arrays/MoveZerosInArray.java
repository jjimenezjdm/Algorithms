package com.algorithms.arrays;

import java.util.Arrays;

public class MoveZerosInArray {
    /**
     * Given an array full of integers, can you write a method to move every zero to the right side of
     * the array? The result order of non zero element is not important. Take into account you can find
     * negative numbers inside the array. For example:
     * <p>
     * Input: [1,2,0,4,3] Output: [1,2,3,4,0]
     *
     * @author Pedro Vicente Gómez Sánchez.
     */

    public static void main(String[] args) {

        //Integer[] firstArray = new Integer[]{1, 2, 0, 4, 5, 6};
        Integer[] secondArray = new Integer[]{0, 0, 0, 4, 0, 6};
        boolean mover = true;
        while (mover) {
            mover = false;
            for (int i = 0; i < secondArray.length - 1; i++) {
                if (secondArray[i] == 0 && secondArray[i + 1] != 0) {
                    int element = secondArray[i];
                    secondArray[i] = secondArray[i + 1];
                    secondArray[i + 1] = element;
                    mover = true;
                }
            }
        }

        System.out.println(Arrays.toString(secondArray));
    }

}
