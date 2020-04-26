package com.algorithms.strings;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueChars {

    /**
     * Implement an algorithm to determine if a string has all unique characters. What if you cannot
     * use additional data structures?
     *
     * @author Pedro Vicente Gómez Sánchez.
     * https://github.com/pedrovgs/Algorithms
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String line = sc.nextLine();
        HashSet<Character> wordsInLine = new HashSet<>();
        boolean unique = true;
        for (int i = 0; i < line.length() && unique; i++) {
            if (wordsInLine.contains(line.charAt(i)))
                unique = false;
            else
                wordsInLine.add(line.charAt(i));
        }
        System.out.println(unique);
    }
}
