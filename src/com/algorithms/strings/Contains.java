package com.algorithms.strings;


import java.util.Scanner;

public class Contains {
    /**
     * Given two strings passed as argument, can you write a method to return true if the second
     * contains the first one?
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String[] line = sc.nextLine().split(" ");
        System.out.println(containsRude(line[0], line[1]));
    }

    private static boolean contains(String oneWord, String twoWord) {
        return twoWord.contains(oneWord);
    }

    private static boolean containsRude(String oneWord, String twoWord) {
        boolean contain = false;

        char[] charsOne = oneWord.toCharArray();
        char[] charsTwo = twoWord.toCharArray();

        if (charsOne.length <= charsTwo.length) {
            int indexOne = 0;
            boolean finish = false;
            boolean start = false;
            for (int j = 0; j < charsTwo.length && !finish; j++) {
                if (charsTwo[j] == charsOne[indexOne]) {
                    start = true;
                    indexOne++;
                } else {
                    if (start && (indexOne != charsOne.length - 1)) {
                        start = false;
                        indexOne = 0;
                    }
                }
                if (charsOne.length == indexOne) {
                    contain = true;
                    finish = true;
                }
            }
        }

        return contain;
    }
}
