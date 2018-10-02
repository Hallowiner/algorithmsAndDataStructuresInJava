package com.practica.java.list;

public class LinkedList {

    private Link link;

    public void insertFirst(int data) {
        Link l = new Link(data);
        l.setNext(link);
        link = l;
    }

    public Link removeFirst () {
        if (link == null) {
            return null;
        }
        Link l = link;
        link = l.getNext();
        l.setNext(null);
        return l;
    }

    public Link delete(int val) {
        Link current = link;
        Link prevoius = link;

        while (current.getData() != val) {
            if(current.getNext() == null) {
                return null;
            }
            prevoius = current;
            current = current.getNext();
        }
        if(current == link) {
            link = link.getNext();
        } else {
            prevoius.setNext(current.getNext());
        }
        return current;
    }

    public Link find(int val) {
        Link aux = link;
        while(aux != null) {
            if (aux.getData() == val) {
                return aux;
            }
            aux = aux.getNext();
        }
        return null;
    }

    public void displayList() {
        Link l = link;
        while(l != null) {
            l.display();
            l = l.getNext();
        }
    }
}
