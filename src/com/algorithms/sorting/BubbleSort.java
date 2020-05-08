package com.algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {

    /**
     * Given an array full of integers implement a bubble sort algorithm to sort the content inside the
     * array.
     *
     * @author Pedro Vicente Gómez Sánchez.
     */

    public static void main(String[] args) {

        Integer[] secondArray = new Integer[]{3, 2, 5, 9, 8, 4, 0, 6};
        boolean mover = true;
        while (mover) {
            mover = false;
            for (int i = 0; i < secondArray.length - 1; i++) {
                if (secondArray[i] > secondArray[i + 1]) {
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
