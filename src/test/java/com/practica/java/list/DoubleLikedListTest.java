package com.practica.java.list;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleLikedListTest {

    private DoubleLikedList doubleLikedList;

    @Before
    public void setUp() throws Exception {
        doubleLikedList = new DoubleLikedList();
    }

    @Test
    public void insertFirst_After() {
        doubleLikedList.insertFirst(5);
        doubleLikedList.insertFirst(4);
        doubleLikedList.insertFirst(2);
        doubleLikedList.insertFirst(1);

        doubleLikedList.insertAfter(3);

        doubleLikedList.display();

    }

    @Test
    public void insertLast_After() {
        doubleLikedList.insertLast(1);
        doubleLikedList.insertLast(2);
        doubleLikedList.insertLast(4);
        doubleLikedList.insertLast(5);

        doubleLikedList.insertAfter(3);

        doubleLikedList.display();

    }

    @Test
    public void deleteAfter() {
        doubleLikedList.insertFirst(5);
        doubleLikedList.insertFirst(4);
        doubleLikedList.insertFirst(3);
        doubleLikedList.insertFirst(2);
        doubleLikedList.insertFirst(1);

        doubleLikedList.deleteAfter(3);

        doubleLikedList.display();
    }
}