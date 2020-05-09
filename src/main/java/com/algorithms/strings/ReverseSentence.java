package com.algorithms.strings;


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
     * https://github.com/pedrovgs/Algorithms
     * @developer Judit Jiménez Jiménez
     */

    public String reverseSentence(String line) {
        final String[] lineArray = line.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = lineArray.length - 1; i >= 0; i--) {
            sb.append(lineArray[i]).append(" ");
        }
        return sb.toString();
    }
}
