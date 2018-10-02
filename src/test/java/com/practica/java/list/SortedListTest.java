package com.practica.java.list;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedListTest {

    private SortedList sortedList;

    @Before
    public void setUp() throws Exception {
        sortedList = new SortedList();
    }

    @Test
    public void insert() {
        sortedList.insert(4);
        sortedList.insert(8);
        sortedList.insert(3);
        sortedList.insert(2);
        sortedList.insert(1);

        sortedList.display();
    }
}