package com.practica.java.list;

public class DoubleEndedList {

    private Link first;
    private Link last;

    public DoubleEndedList() {
        first = null;
        last = null;
    }

    public void insertFirst(int v) {
        Link aux = new Link(v);
        aux.setNext(first);
        first = aux;
        if (last == null) {
            last = aux;
        }
    }

    public void insertLast(int v) {
        Link aux = new Link(v);
        if (last != null) {
            last.setNext(aux);
        }
        last = aux;
        if (first == null) {
            first = aux;
        }
    }

    public Link removeFirst() {
        Link l = first;
        if (first != null) {
            first = first.getNext();
        }
        if(first == null) {
            last = null;
        }
        return l;
    }

    public void displayList() {
        Link l = first;
        while(l != null) {
            l.display();
            l = l.getNext();
        }
    }
}
