package com.algorithms.arrays;

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


    public int[] moveZerosInArray(int[] array) {
        boolean mover = true;
        while (mover) {
            mover = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] == 0 && array[i + 1] != 0) {
                    int element = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = element;
                    mover = true;
                }
            }
        }
        return array;
    }

}
