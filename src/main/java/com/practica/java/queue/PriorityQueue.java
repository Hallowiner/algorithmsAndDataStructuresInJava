package com.practica.java.queue;

public class PriorityQueue {

    private int[] array;
    private int size;
    private int front;
    private int back;

    public PriorityQueue(int maxS) {
        this.array = new int[maxS];
        this.front = maxS-1;//0;
        this.back = maxS;//-1;
        this.size = maxS;
    }

    public boolean insert(int elem) {
        //insertarlo al final y re-ordenar el array?
       /* this.array[++back] = elem;
        if (size() > 1) {
            insertSort(back);
        }
        return true;
        */
        this.array[front--] = elem;
        invertInsertSort(front);
        return true;
    }

    private void insertSort(int mark) {
        int aux = array[mark];
        int pos = mark;
        while (pos > 0 && array[pos - 1] > aux) {
            array[pos] = array[pos - 1];
            pos--;
        }
        array[pos] = aux;
    }

    private void invertInsertSort(int mark) {
        int aux = array[mark];
        int pos = mark;
        while (pos < size - 1 && array[pos + 1] < aux) {
            array[pos] = array[pos + 1];
            pos++;
        }
        array[pos] = aux;
    }

    public int remove() {
        return array[front++];
    }

    public int size() {
        return (back + 1) - front;
    }

}
