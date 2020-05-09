package com.algorithms.arrays;

import java.util.Arrays;
import java.util.List;

public class KthSmallestElement {

    /**
     * Given an array arr[] and a number K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.
     * Expected Time Complexity: O(n)
     * <p>
     * Input:
     * The first line of input contains an integer T, denoting the number of testcases.
     * Then T test cases follow. Each test case consists of three lines.
     * First line of each testcase contains an integer N denoting size of the array.
     * Second line contains N space separated integer denoting elements of the array.
     * Third line of the test case contains an integer K.
     *
     * @developer Judit Jiménez Jiménez
     */
    public int[] kthSmallestElement(int numberTestCases, List<String[]> lineArrayList, int knumber) {

        int[] result = new int[numberTestCases];

        for (int i = 0; i < numberTestCases; i++) {
            String[] lineArray = lineArrayList.get(i);
            int[] numbers = convertStringArrayToIntArray(lineArray);

            Arrays.sort(numbers);
            result[i] = numbers[knumber - 1];
        }
        return result;
    }

    private static int[] convertStringArrayToIntArray(String[] array) {
        int[] arr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arr[i] = Integer.parseInt(array[i]);
        }
        return arr;
    }
}
