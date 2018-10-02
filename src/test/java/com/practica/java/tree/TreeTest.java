package com.practica.java.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {

    private Tree tree;

    @Before
    public void setUp() throws Exception {
        tree = new Tree();
    }

    @Test
    public void find() {
        Assert.assertNull(tree.find(4));
    }

    @Test
    public void insert() {
        tree.insert(4);
        tree.insert(7);
        tree.insert(2);
        tree.insert(8);
        tree.insert(9);
        tree.insert(1);
        tree.insert(3);


        Assert.assertNotNull(tree.find(1));
    }

    @Test
    public void inOrder() {
        tree.insert(4);
        tree.insert(7);
        tree.insert(2);
        tree.insert(8);
        tree.insert(9);
        tree.insert(1);
        tree.insert(3);


        tree.inOrder(tree.getRoot());
    }

    @Test
    public void minimun() {
        tree.insert(4);
        tree.insert(7);
        tree.insert(2);
        tree.insert(8);
        tree.insert(9);
        tree.insert(1);
        tree.insert(3);

        Assert.assertEquals(1, tree.minimun());
    }

    @Test
    public void maximun() {
        tree.insert(4);
        tree.insert(7);
        tree.insert(2);
        tree.insert(8);
        tree.insert(9);
        tree.insert(1);
        tree.insert(3);

        Assert.assertEquals(9, tree.maximun());
    }

    @Test
    public void remove() {
    }
}