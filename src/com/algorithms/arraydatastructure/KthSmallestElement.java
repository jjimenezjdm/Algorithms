package com.algorithms.arraydatastructure;

import java.util.Arrays;
import java.util.Scanner;

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
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int numberTestCases = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numberTestCases; i++) {
            String length = sc.nextLine();
            String[] lineArray = sc.nextLine().split(" ");
            int[] numbers = convertStringArrayToIntArray(lineArray);
            int k = Integer.parseInt(sc.nextLine());

            Arrays.sort(numbers);
            System.out.println(numbers[k - 1]);

        }

        sc.close();
    }

    private static int[] convertStringArrayToIntArray(String[] array) {
        int[] arr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arr[i] = Integer.parseInt(array[i]);
        }
        return arr;
    }
}
