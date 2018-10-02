package com.practica.java.list;

public class DoubleLikedList {

    private Link first;
    private Link last;

    public void insertFirst(int v) {
        Link l = new Link(v);
        l.setNext(first);
        if(first != null) {
            first.setPrev(l);
        }
        first = l;
        if(last == null) {
            first = l;
        }
    }

    public void insertLast(int v) {
        Link l = new Link(v);
        l.setPrev(last);
        if(last != null) {
            last.setNext(l);
        }
        last = l;
        if(first == null) {
            first = l;
        }
    }

    public void insertAfter(int v) {
        Link l = new Link(v);
        Link current = first;

        while (current != null && current.getData() < v) {
            current = current.getNext();
        }

        //4
        current.getNext();//5
        current.getPrev();//2
        //3
        l.setPrev(current.getPrev());//2
        l.setNext(current);
        current.setPrev(l);
    }

    public Link deleteAfter(int v) {
        Link current = first;

        while (current != null && current.getData() != v) {
            current = current.getNext();
        }
        //3
        current.getNext();//4
        current.getPrev();//2

        current.getPrev().setNext(current.getNext());

        return current;
    }

    public void display() {
        Link aux = first;
        while (aux != null) {
            System.out.print(" " + aux.getData());
            aux = aux.getNext();
        }
    }
}
