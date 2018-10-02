package com.practica.java.list;

public class SortedList {

    private Link first;

    public void insert(int v) {
        Link l = new Link(v);
        Link previous = null;
        Link current = first;

        while(current != null && current.getData() < l.getData()) {
            previous = current;
            current = current.getNext();
        }
        if(previous == null) {
            first = l;
        } else {
            previous.setNext(l);
        }
        l.setNext(current);
    }

    public void display() {
        Link aux = first;
        while (aux != null) {
            System.out.print(" " + aux.getData());
            aux = aux.getNext();
        }
    }
}
