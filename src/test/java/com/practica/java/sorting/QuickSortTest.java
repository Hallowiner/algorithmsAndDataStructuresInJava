package com.practica.java.sorting;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class QuickSortTest {

    private QuickSort quickSort;

    @Before
    public void setUp() throws Exception {
        quickSort = new QuickSort();
    }

    @Test
    public void sort() {
        quickSort.sort(new int[]{2, 8, 5, 4,9,1, 3, 7, 6}, 0, 8);
    }
}