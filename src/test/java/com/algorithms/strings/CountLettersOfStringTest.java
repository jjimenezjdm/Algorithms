package com.algorithms.strings;

import org.junit.Assert;
import org.junit.Test;

public class CountLettersOfStringTest {

    CountLettersOfString countLettersOfString = new CountLettersOfString();

    @Test
    public void countLettersOfString() {
        Assert.assertEquals("a5b1c5", countLettersOfString.countLetters("aabcccccaaa"));
    }

    @Test
    public void countTwoLettersOfString() {
        Assert.assertEquals("a5b2c5", countLettersOfString.countLetters("aabcccccaaab"));
    }

}
