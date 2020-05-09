package com.algorithms.strings;

public class Contains {
    /**
     * Given two strings passed as argument, can you write a method to return true if the second
     * contains the first one?
     *
     * @author Pedro Vicente Gómez Sánchez.
     * https://github.com/pedrovgs/Algorithms
     * @developer Judit Jiménez Jiménez
     */
    public boolean containString(String contain, String contained) {
        return containsRude(contain, contained);
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
