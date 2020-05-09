package com.algorithms.strings;

import org.junit.Assert;
import org.junit.Test;

public class ContainsTest {

    Contains contains = new Contains();

    @Test
    public void containTest() {
        Assert.assertTrue(contains.containString("arbol", "arboleda"));
    }

    @Test
    public void notContainTest() {
        Assert.assertFalse(contains.containString("pez", "arboleda"));
    }
}
