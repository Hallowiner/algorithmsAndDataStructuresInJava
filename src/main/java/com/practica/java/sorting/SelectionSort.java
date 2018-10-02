package com.practica.java.sorting;

public class SelectionSort {

    public int[] sort(int[] array) {
        int aux;
        for (int i = 0; i < array.length -1; i++) {
            int pos = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[pos]) {
                    pos = j;
                }
            }
            //swapp
            aux = array[i];
            array[i] = array[pos];
            array[pos] = aux;
        }
        return array;
    }
}
