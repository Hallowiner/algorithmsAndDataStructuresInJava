package com.practica.java.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HighArrayTest {

    private HighArray highArray;

    @Before
    public void setUp() throws Exception {
        highArray = new HighArray(30);
    }

    @Test
    public void insert() {
        highArray.insert(10);
        highArray.insert(20);
        highArray.insert(30);
        highArray.insert(40);
        highArray.insert(50);

        Assert.assertEquals(0, highArray.find(10));
        Assert.assertEquals(1, highArray.find(20));
        Assert.assertEquals(2, highArray.find(30));
        Assert.assertEquals(3, highArray.find(40));
        Assert.assertEquals(4, highArray.find(50));
        Assert.assertEquals(5, highArray.find(60));
    }

    @Test
    public void delete() {
        highArray.insert(10);
        highArray.insert(20);
        highArray.insert(30);
        highArray.insert(40);
        highArray.insert(50);

        Assert.assertEquals(2, highArray.find(30));
        highArray.delete(30);
        Assert.assertEquals(4, highArray.find(30));
        Assert.assertEquals(2, highArray.find(40));
        highArray.delete(35);
        Assert.assertEquals(2, highArray.find(40));
    }

    @Test
    public void find() {
        highArray.insert(10);
        highArray.insert(20);
        highArray.insert(40);
        highArray.insert(50);

        Assert.assertEquals(4, highArray.find(30));
        Assert.assertEquals(2, highArray.find(40));
    }

    @Test
    public void display() {
    }
}

//req: implementar busqueda binaria
// necesito