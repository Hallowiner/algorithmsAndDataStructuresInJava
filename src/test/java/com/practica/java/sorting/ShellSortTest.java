package com.practica.java.sorting;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ShellSortTest {

    private ShellSort shellSort;

    @Before
    public void setUp() throws Exception {
        shellSort = new ShellSort();
    }

    @Test
    public void sort() {

        System.out.println(Arrays.toString(shellSort.sort(new int[]{2, 7, 8, 3, 1, 6, 4, 5, 9})));
    }
}