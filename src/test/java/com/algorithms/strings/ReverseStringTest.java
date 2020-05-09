package com.algorithms.strings;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {

    ReverseString reverseStringTest = new ReverseString();

    @Test
    public void reverseStringTest() {
        Assert.assertEquals("ana", reverseStringTest.reverse("ana"));
    }

    @Test
    public void reverseStringTwoTest() {
        Assert.assertEquals("anacleto", reverseStringTest.reverse("otelcana"));
    }
}
