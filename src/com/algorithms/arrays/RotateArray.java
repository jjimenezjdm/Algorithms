package com.algorithms.arrays;

import java.util.Scanner;

public class RotateArray {

    /**
     * Given an unsorted array arr[] of size N, rotate it by D elements (clockwise).
     * <p>
     * Input:
     * The first line of the input contains T denoting the number of testcases. First line of each test case contains two space separated elements, N denoting the size of the array and an integer D denoting the number size of the rotation. Subsequent line will be the N space separated array elements.
     * <p>
     * Output:
     * For each testcase, in a new line, output the rotated array.
     * <p>
     * Constraints:
     * 1 <= T <= 200
     * 1 <= N <= 107
     * 1 <= D <= N
     * 0 <= arr[i] <= 105
     * <p>
     * Example:
     * Input:
     * 2
     * 5 2
     * 1 2 3 4 5
     * 10 3
     * 2 4 6 8 10 12 14 16 18 20
     * <p>
     * Output:
     * 3 4 5 1 2
     * 8 10 12 14 16 18 20 2 4 6
     * <p>
     * Explanation :
     * Testcase 1: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2.
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int numberTestCases = Integer.parseInt(sc.nextLine());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numberTestCases; i++) {
            final int rotate = Integer.parseInt(sc.nextLine().split(" ")[1]);
            String[] array = sc.nextLine().split(" ");
            int len = array.length;

            for (int j = rotate; j < len; j++) {
                result.append(array[j] + " ");
                if (j == array.length - 1) {
                    len = rotate;
                    j = -1;
                }
            }
            result.append("\n");
        }

        System.out.print(result);
        sc.close();
    }

}
