package com.practica.java.sorting;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SelectionSortTest {

    private SelectionSort selectionSort;

    @Before
    public void setUp() throws Exception {
        selectionSort = new SelectionSort();
    }

    @Test
    public void sort() {
        System.out.println(Arrays.toString(selectionSort.sort(new int[]{99, 2, 5, 3,54, 1, 4, 8, 6, 7, 0})));
    }
}