package com.practica.java.stack;

public class Stack {

    private int[] array;
    private int maxSize;
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.array = new int[maxSize];
        this.top = -1;
    }

    public void push(int elem) {
        /*
        top++;
        array[top] = elem;
        */
        array[++top] = elem;
    }

    public int pop() {
        return array[top--];
    }

    public int peek() {
        return array[top];
    }

    public boolean isEmplty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize-1);
    }
}
