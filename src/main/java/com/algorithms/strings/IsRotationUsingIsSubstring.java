package com.algorithms.strings;


import java.util.Arrays;

public class IsRotationUsingIsSubstring {

    /**
     * Assume you have a method isSubstring which checks if one word is a substring of another. Given
     * two strings, s1 and s2, write code to check if s2 isa rotation of s1 using only
     * one call to isSubstring (e.g., "waterbottle" is a rotation of "erbotlewat").
     *
     * @author Pedro Vicente Gómez Sánchez.
     * https://github.com/pedrovgs/Algorithms
     * @developer Judit Jiménez Jiménez
     */
    public boolean isRottation(String firstWord, String secondWord) {
        char[] firstString = firstWord.toCharArray();
        char[] secondString = secondWord.toCharArray();

        Arrays.sort(firstString);
        Arrays.sort(secondString);

        String word1 = new String(firstString);
        String word2 = new String(secondString);

        return word1.contains(word2);

    }


}
