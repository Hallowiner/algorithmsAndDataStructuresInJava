package com.practica.java.tree;

public class Nodo {
    private int data;
    private Nodo rightChild;
    private Nodo leftChild;

    public Nodo(int val) {
        this.data = val;
    }

    public Nodo getRightChild() {
        return rightChild;
    }

    public void setRightChild(Nodo rightChild) {
        this.rightChild = rightChild;
    }

    public Nodo getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Nodo leftChild) {
        this.leftChild = leftChild;
    }

    public int getData() {
        return data;
    }
}
