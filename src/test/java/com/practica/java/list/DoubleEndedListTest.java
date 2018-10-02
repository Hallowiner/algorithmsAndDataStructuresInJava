package com.practica.java.list;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleEndedListTest {

    private DoubleEndedList doubleEndedList;

    @Before
    public void setUp() throws Exception {
        doubleEndedList = new DoubleEndedList();
    }

    @Test
    public void insertFirst() {
        doubleEndedList.insertFirst(3);
        doubleEndedList.insertFirst(5);
        doubleEndedList.insertFirst(9);

        doubleEndedList.displayList();
    }

    @Test
    public void insertLast() {
        doubleEndedList.insertFirst(3);
        doubleEndedList.insertFirst(4);
        doubleEndedList.insertFirst(1);
        doubleEndedList.insertLast(8);
        doubleEndedList.insertLast(5);

        doubleEndedList.displayList();
    }

    @Test
    public void removeFirst() {
        doubleEndedList.insertFirst(3);
        doubleEndedList.insertFirst(4);
        doubleEndedList.insertFirst(1);
        doubleEndedList.insertLast(8);
        doubleEndedList.insertLast(5);


        Assert.assertNotNull(doubleEndedList.removeFirst());
        doubleEndedList.displayList();
    }
}