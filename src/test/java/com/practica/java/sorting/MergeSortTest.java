package com.practica.java.sorting;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {
    private MergeSort mergeSort;

    @Before
    public void setUp() throws Exception {
        mergeSort = new MergeSort();
    }

    @Test
    public void sortImpar() {
        System.out.println(Arrays.toString(mergeSort.sort(new int[]{8, 9, 2, 4, 3, 5, 1, 6, 7}, 0, 8)));
    }

    @Test
    public void sortPar() {
        System.out.println(Arrays.toString(mergeSort.sort(new int[]{8, 9, 2, 4, 3, 5, 1, 6, 0, 7}, 0, 9)));
    }
}