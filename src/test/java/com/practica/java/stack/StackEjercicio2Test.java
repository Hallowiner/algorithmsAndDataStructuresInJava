package com.practica.java.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackEjercicio2Test {
    private StackEjercicio2 stackEjercicio2;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void delimiterMatch() {
        String expression ="a{b(c[d]e)f}";
        stackEjercicio2 = new StackEjercicio2(expression.length());
        Assert.assertTrue(stackEjercicio2.delimiterMatch(expression));
    }

    @Test
    public void delimiteNotMatch() {
        String expression ="a{b(c[de)f}";
        stackEjercicio2 = new StackEjercicio2(expression.length());
        Assert.assertFalse(stackEjercicio2.delimiterMatch(expression));
    }

    @Test
    public void delimiteNotMatch2() {
        String expression ="a{b(c[d]e)f}{";
        stackEjercicio2 = new StackEjercicio2(expression.length());
        Assert.assertFalse(stackEjercicio2.delimiterMatch(expression));
    }
}