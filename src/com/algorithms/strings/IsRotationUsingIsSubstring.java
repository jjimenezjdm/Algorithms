package com.algorithms.strings;


import java.util.Arrays;
import java.util.Scanner;

public class IsRotationUsingIsSubstring {

    /**
     * Assume you have a method isSubstring which checks if one word is a substring of another. Given
     * two strings, s1 and s2, write code to check if s2 isa rotation of s1 using only
     * one call to isSubstring (e.g., "waterbottle" is a rotation of "erbotlewat").
     *
     * @author Pedro Vicente Gómez Sánchez.
     * https://github.com/pedrovgs/Algorithms
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String[] input = sc.nextLine().split(" ");
        char[] firstString = input[0].toCharArray();
        char[] secondString = input[1].toCharArray();

        Arrays.sort(firstString);
        Arrays.sort(secondString);

        String word1 = new String(firstString);
        String word2 = new String(secondString);

        System.out.println(word1.contains(word2));

    }


}
