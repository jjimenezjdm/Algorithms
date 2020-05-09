package com.algorithms.sorting;

import java.util.Arrays;

public class Quicksort {

    /**
     * Given an array full of integers implement a quick sort algorithm to sort the content inside
     * the array.
     *
     * @author jsroyal
     * @developer Judit Jiménez Jiménez
     */
    public static void main(String[] args) {

        int[] secondArray = new int[]{13, 2, 15, 9, 8, 4, 0, 6};
        quickSort(secondArray, 0, secondArray.length - 1);

        System.out.println(Arrays.toString(secondArray));
    }

    private static void quickSort(int[] numbers, int left, int right) {
        if (left < right) {
            int pivotIndex = getPivot(numbers, left, right);
            quickSort(numbers, left, pivotIndex - 1);  //sort left of pivot
            quickSort(numbers, pivotIndex, right);  //sort right of pivot
        }
    }

    private static int getPivot(int[] numbers, int left, int right) {
        int pivot = numbers[right];
        int i = left - 1;
        for (int j = left; j < right; ++j) {
            if (numbers[j] <= pivot)
                change(numbers, ++i, j);
        }
        change(numbers, ++i, right);
        return i;
    }

    private static void change(int[] array, int left, int right) {
        int aux = array[right];
        array[right] = array[left];
        array[left] = aux;
    }
}
