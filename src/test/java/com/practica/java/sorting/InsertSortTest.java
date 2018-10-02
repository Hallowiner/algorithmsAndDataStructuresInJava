package com.practica.java.sorting;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertSortTest {

    private InsertSort insertSort;

    @Before
    public void setUp() throws Exception {
        insertSort = new InsertSort();
    }

    @Test
    public void sort() {
        System.out.println(Arrays.toString(insertSort.sort(new int[] {9,3,5,2,7,8,6,1,4})));
    }
}