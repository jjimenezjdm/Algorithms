package com.algorithms.strings;


import java.util.Arrays;
import java.util.Scanner;

public class IsRotationUsingIsSubstring {


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
