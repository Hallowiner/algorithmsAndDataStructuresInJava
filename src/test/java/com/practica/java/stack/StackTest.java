package com.practica.java.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    private Stack stack;

    @Before
    public void setUp() throws Exception {
        stack = new Stack(10);
    }

    @Test
    public void push() {
        stack.push(6);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(1);
        stack.push(8);
        stack.push(2);
        stack.push(9);

        Assert.assertFalse(stack.isEmplty());
        Assert.assertFalse(stack.isFull());
    }

    @Test
    public void pop() {
        stack.push(6);
        Assert.assertEquals(6, stack.pop());
        Assert.assertTrue(stack.isEmplty());
    }

    @Test
    public void peek() {
        stack.push(6);
        Assert.assertEquals(6, stack.peek());
        Assert.assertFalse(stack.isEmplty());
    }

    @Test
    public void isEmplty() {
        Assert.assertTrue(stack.isEmplty());
        stack.push(3);
        Assert.assertFalse(stack.isEmplty());
    }

    @Test
    public void isFull() {
        Assert.assertFalse(stack.isFull());
        for(int i = 0; i< 10; i++) {
            stack.push(i+1);
        }
        Assert.assertTrue(stack.isFull());
    }
}