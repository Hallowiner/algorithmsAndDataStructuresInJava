package com.practica.java.queue;

public class Queue {

    private int[] array;
    private int size;
    private int front;
    private int back;
    private int amount;

    public Queue(int maxSize) {
        this.array = new int[maxSize];
        this.size = maxSize;
        this.front = 0;
        this.back = -1;
        this.amount = 0;
    }

    public boolean insert(int elem) {
        if (back + 1 == size) {
            back = -1;
        }
        if (back + 1 == front) {
            System.out.println("Queue lleno");
            return false;
        }
        this.array[++back] = elem;
        amount++;
        return true;
    }

    public int remove() {
        if (front == -1) {
            System.out.println("Queue vacio");
            return -1;
        }
        int aux = this.array[front++];
        amount--;
        if (front == size) {
            front = 0;
        }
        return aux;

    }

    public int peek() {
        return this.array[front];
    }

    public boolean isFull() {
        return (amount == size);
    }

    public boolean isEmpty() {
        return (amount==0);
    }

    public int size() {
        return amount;
    }
}
