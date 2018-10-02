package com.practica.java.queue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriorityQueueTest {
    private PriorityQueue priorityQueue;

    @Before
    public void setUp() throws Exception {
        priorityQueue = new PriorityQueue(10);
    }

    @Test
    public void insert() {
        priorityQueue.insert(9);
        priorityQueue.insert(2);
        priorityQueue.insert(4);
        priorityQueue.insert(7);
        priorityQueue.insert(1);

        Assert.assertEquals(1,priorityQueue.remove());
    }

    @Test
    public void remove() {
    }

    @Test
    public void size() {
        priorityQueue.insert(9);
        priorityQueue.insert(2);
        priorityQueue.insert(4);
        priorityQueue.insert(7);
        priorityQueue.insert(1);

        Assert.assertEquals(5,priorityQueue.size());
    }
}