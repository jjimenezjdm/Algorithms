package com.algorithms.strings;

import org.junit.Assert;
import org.junit.Test;

public class CompressStringTest {

    CompressString compressString = new CompressString();

    @Test
    public void compressStringTest() {
        String string = "aabcccccaaa";
        Assert.assertEquals("a2b1c5a3", compressString.compressString(string));
    }

    @Test
    public void compressStringAllSameLetterTest() {
        String string = "aaaa";
        Assert.assertEquals("a4", compressString.compressString(string));
    }

    @Test
    public void compressStringOneChar() {
        String string = "a";
        Assert.assertEquals("", compressString.compressString(string));
    }

    @Test
    public void compressStringLessThanThreeCharacters() {
        String string = "abc";
        Assert.assertEquals("abc", compressString.compressString(string));
    }
}
