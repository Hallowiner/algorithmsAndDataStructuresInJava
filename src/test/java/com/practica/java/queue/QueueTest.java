package com.practica.java.queue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    private Queue queue;

    @Before
    public void setUp() throws Exception {
        queue = new Queue(10);
    }

    @Test
    public void insert() {
        queue.insert(2);
        queue.insert(5);
        queue.insert(6);
        queue.insert(8);
        queue.insert(1);
        queue.insert(4);
        queue.insert(9);

        Assert.assertEquals(2, queue.peek());
    }

    @Test
    public void remove() {
        queue.insert(2);
        queue.insert(5);
        queue.insert(6);
        queue.insert(8);
        queue.insert(1);
        queue.insert(4);
        queue.insert(9);

        Assert.assertEquals(2, queue.remove());
        Assert.assertEquals(5, queue.remove());
        Assert.assertEquals(6, queue.remove());
        Assert.assertNotEquals(1, queue.remove());
    }

    @Test
    public void insertAndRemove() {
        queue.insert(2);
        queue.insert(5);
        queue.remove();
        queue.insert(8);
        queue.insert(1);
        queue.remove();
        queue.insert(4);
        queue.insert(9);
        queue.remove();
        queue.insert(3);

        Assert.assertEquals(1, queue.remove());
        Assert.assertEquals(4, queue.peek());
        Assert.assertEquals(4, queue.remove());
        Assert.assertNotEquals(1, queue.remove());
    }

    @Test
    public void insertFull() {
        queue.insert(2);
        queue.insert(5);
        queue.insert(8);
        queue.insert(1);
        queue.insert(6);
        queue.insert(3);
        queue.insert(4);
        queue.insert(8);
        queue.insert(9);
        Assert.assertTrue(queue.insert(7));
        Assert.assertFalse(queue.insert(2));
    }

    @Test
    public void removeEmpty() {
        queue.insert(2);
        queue.remove();
        Assert.assertEquals(-1, queue.remove());
    }
}