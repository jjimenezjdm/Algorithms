package com.algorithms.strings;

import org.junit.Assert;
import org.junit.Test;

public class UniqueCharsTest {

    UniqueChars uniqueChars = new UniqueChars();

    @Test
    public void uniqueCharsTest() {
        String string = "uniqe char";
        Assert.assertTrue(uniqueChars.uniqueChars(string));
    }

    @Test
    public void notUniqueCharsTest() {
        String string = "not unique chars";
        Assert.assertFalse(uniqueChars.uniqueChars(string));
    }
}
