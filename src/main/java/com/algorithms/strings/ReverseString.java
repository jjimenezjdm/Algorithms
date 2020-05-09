package com.algorithms.strings;

public class ReverseString {
    /**
     * Implement a method String reverse(String str) to reverse a String passed as parameter.
     *
     * @author Pedro Vicente Gómez Sánchez.
     * https://github.com/pedrovgs/Algorithms
     */

    public String reverse(String word) {
        final String[] line = word.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = line.length - 1; i >= 0; i--) {
            sb.append(line[i]);
        }

        // 2ª Forma: Utilizando char
        final char[] chars = word.toCharArray();
        for (int j = chars.length - 1; j >= 0; j--) {
            System.out.print(chars[j]);
        }

        return sb.toString();
    }
}
