package com.practica.java.sorting;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PartitioningTest {

    private Partitioning partitioning;

    @Before
    public void setUp() throws Exception {
        partitioning = new Partitioning();
    }


    @Test
    public void partitionIt() {
        System.out.println(Arrays.toString(partitioning.partitionIt(new int[]{3, 8, 2, 7, 6, 9, 1, 4, 5}, 0, 8)));
    }
}