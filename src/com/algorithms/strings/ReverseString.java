package com.algorithms.strings;

import java.util.Scanner;

public class ReverseString {
    /**
     * Implement a method String reverse(String str) to reverse a String passed as parameter.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String word = sc.nextLine();
        final String[] line = word.split("");

        for (int i = line.length - 1; i >= 0; i--) {
            System.out.print(line[i]);
        }
        System.out.println();

        // 2ª Forma: Utilizando char
        final char[] chars = word.toCharArray();
        for (int j = chars.length - 1; j >= 0; j--) {
            System.out.print(chars[j]);
        }
    }
}
