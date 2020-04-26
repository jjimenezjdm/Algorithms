package com.algorithms.strings;

import java.util.HashMap;
import java.util.Scanner;

public class CountLettersOfString {
    /**
     * Implement a method to perform basic string compression using the counts of repeated characters.
     * For example, the string aabcccccaaa would become a5b1c5. If the "compressed" string would not
     * become smaller than the original string, your method should return the original string.
     *
     * @author Pedro Vicente Gómez Sánchez.
     * https://github.com/pedrovgs/Algorithms
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String word = sc.nextLine();
        HashMap<Character, Integer> words = new HashMap<>();
        for (char character : word.toCharArray()) {
            if (words.containsKey(character)) {
                words.put(character, words.get(character) + 1);
            } else {
                words.put(character, 1);
            }
        }
        String result = "";
        for (Character key : words.keySet()) {
            result = result.concat(String.valueOf(key));
            result = result.concat(String.valueOf(words.get(key)));
        }

        if (result.length() >= word.length()) {
            result = word;
        }

        System.out.println(result);

    }
}
