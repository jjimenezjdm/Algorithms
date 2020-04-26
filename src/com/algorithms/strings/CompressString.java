package com.algorithms.strings;

import java.util.Scanner;

public class CompressString {

    /**
     * Implement a method to perform basic string compression using the counts of repeated characters.
     * For example, the string aabcccccaaa would become a2blc5a3. If the "compressed" string would not
     * become smaller than the original string, your method should return the original string.
     *
     * @author Pedro Vicente Gómez Sánchez.
     * https://github.com/pedrovgs/Algorithms
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String word = sc.nextLine();
        final char[] line = word.toCharArray();
        String result = "";
        char character = line[0];
        int cont = 1;
        boolean large = false;
        for (int i = 1; i < line.length && !large; i++) {
            if (character != line[i]) {
                result = result.concat(String.valueOf(character));
                result = result.concat(String.valueOf(cont));
                character = line[i];
                cont = 1;
            } else {
                cont++;
            }
            if (i == line.length - 1) {
                result = result.concat(String.valueOf(character));
                result = result.concat(String.valueOf(cont));
            }
            if (result.length() > line.length) {
                result = word;
                large = true;
            }
        }

        System.out.println(result);
    }

}
