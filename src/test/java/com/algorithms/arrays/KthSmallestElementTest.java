package com.algorithms.arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementTest {

    KthSmallestElement kthSmallestElement = new KthSmallestElement();

    @Test
    public void kthSmallestElementTestWithOneScenario() {

        String[] array = new String[]{"1", "2", "4"};
        List<String[]> arrayList = new ArrayList<>();
        arrayList.add(array);
        int[] result = kthSmallestElement.kthSmallestElement(1, arrayList, 2);

        Assert.assertEquals(2, result[0]);
    }

}
