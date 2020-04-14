package com.algorithms.strings;


import java.util.Scanner;

public class ReverseSentence {

    /**
     * Given an input String containing a sentence, can you write a method to reverse the content of
     * the sentence without reverse every word?
     * <p>
     * For example:
     * <p>
     * Input: "Pedro Vicente Gómez" Output: "Gómez Vicente Pedro"
     *
     * @author Pedro Vicente Gómez Sánchez.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String[] line = sc.nextLine().split(" ");

        for (int i = line.length - 1; i >= 0; i--) {
            System.out.print(line[i] + " ");
        }
    }
}
