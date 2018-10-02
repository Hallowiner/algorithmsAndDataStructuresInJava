package com.practica.java.list;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    private LinkedList linkedList;

    @Before
    public void setUp() throws Exception {
        linkedList = new LinkedList();
    }

    @Test
    public void insertFirst() {
        linkedList.insertFirst(1);
        linkedList.insertFirst(4);
        linkedList.insertFirst(2);
        linkedList.insertFirst(5);
        linkedList.insertFirst(8);

        linkedList.displayList();
    }

    @Test
    public void removeFirst() {

        linkedList.insertFirst(1);
        linkedList.insertFirst(4);
        linkedList.insertFirst(2);
        linkedList.insertFirst(5);
        linkedList.insertFirst(8);


        linkedList.removeFirst();
        linkedList.removeFirst();
        linkedList.removeFirst();

        linkedList.displayList();
    }

    @Test
    public void find() {
        linkedList.insertFirst(1);
        linkedList.insertFirst(4);
        linkedList.insertFirst(2);
        linkedList.insertFirst(5);
        linkedList.insertFirst(8);

        Assert.assertNotNull(linkedList.find(5));
        Assert.assertNull(linkedList.find(9));
    }

    @Test
    public void delete() {
        linkedList.insertFirst(1);
        linkedList.insertFirst(4);
        linkedList.insertFirst(2);
        linkedList.insertFirst(5);
        linkedList.insertFirst(8);

        Assert.assertNotNull(linkedList.delete(5));
        Assert.assertNull(linkedList.delete(9));

    }
}