package com.practica.java.sorting;

public class ShellSort {

    int h;

    public ShellSort() {
        h = 1;
    }

    public int[] sort(int[] array) {
        while (h <= array.length / 3) {
            incrementH();
        }
        int temp;
        while (h > 0) {
            for(int outer = h; outer < array.length; outer++) {
                temp = array[outer];
                int inner = outer;

                while (inner > h-1 && array[inner-h] >= temp) {
                    array[inner] = array[inner-h];
                    inner -= h;
                }
                array[inner] = temp;
            }
            decrementH();
        }
        return array;
    }

    private void incrementH() {
        h = (h * 3) + 1;
    }

    private void decrementH() {
        h = (h - 1) / 3;
    }
}
