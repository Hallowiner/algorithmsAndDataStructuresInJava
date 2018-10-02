package com.practica.java.stack;

public class CharStack {

    private char[] array;
    private int size;
    private int top;

    public CharStack(int maxSize) {
        this.size = maxSize;
        this.array = new char[maxSize];
        this.top = -1;
    }

    public void push(char elem) {
        array[++top] = elem;
    }

    public char pop() {
        return array[top--];
    }

    public char peek() {
        return array[top];
    }
}
