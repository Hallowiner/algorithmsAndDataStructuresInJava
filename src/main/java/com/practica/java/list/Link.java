package com.practica.java.list;

public class Link {

    private int data;
    private Link next;
    private Link prev;

    public Link(int data) {
        this.data = data;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    public Link getNext() {
        return next;
    }

    public int getData() {
        return data;
    }

    public Link getPrev() {
        return prev;
    }

    public void setPrev(Link prev) {
        this.prev = prev;
    }

    public void display() {
        System.out.println("Data: " + data);
    }
}
