package com.practica.java.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackEjercicio1Test {

    private StackEjercicio1 stackEjercicio1;

    @Before
    public void setUp() throws Exception {
        stackEjercicio1 = new StackEjercicio1();
    }

    @Test
    public void reverse() {
        Assert.assertEquals("ALOH",stackEjercicio1.reverse("HOLA"));
    }
}