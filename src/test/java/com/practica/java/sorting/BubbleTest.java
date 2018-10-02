package com.practica.java.sorting;

import org.junit.Before;
import org.junit.Test;

public class BubbleTest {

    private Bubble bubble;

    @Before
    public void setUp() throws Exception {
        bubble = new Bubble();
    }

    @Test
    public void sort() {
        //Assert.assertEquals();
        int[] a = new int[]{4, 1, 2, 9, 7, 3, 5, 6, 8};
        int[] array = bubble.sort(a, a.length-1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}