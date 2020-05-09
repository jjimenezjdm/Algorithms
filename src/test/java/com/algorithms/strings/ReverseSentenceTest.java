package com.algorithms.strings;

import org.junit.Assert;
import org.junit.Test;

public class ReverseSentenceTest {

    ReverseSentence reverseSentence = new ReverseSentence();

    @Test
    public void reverseSentenceTest() {
        String string = "Esto es una frase";
        Assert.assertEquals("frase una es Esto ", reverseSentence.reverseSentence(string));
    }


}
