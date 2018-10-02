package com.practica.java.sorting;

import java.util.Arrays;

public class QuickSort {

    public void sort(int[] array, int left, int right) {
        if (right - left <= 0) {
            return;
        }
        /*
        //Si es pequeño, lo resuelvo con insertion!
        if(right - left < 10) {
            insertionSort(array, left, right);
        }
        */

        int partition = partitionIt(array, left, right);
        sort(array, partition + 1, right);
        sort(array, left, partition - 1);
        System.out.println(Arrays.toString(array));
    }

    private int partitionIt(int[] array, int left, int right) {
        int leftP = left - 1;
        int rightP = right;
        int pivot = array[right];

        while (true) {

            while (leftP < right && array[++leftP] < pivot) ;
            while (rightP > left && array[--rightP] > pivot) ;

            if(leftP >= rightP ) {
                break;
            }
            swap(array, leftP, rightP);// intercambia elementos pequeño <-> grande
        }
        swap(array, leftP, right);// ubica el pivot al inicio del subArray derecho! -> su posicion
        return leftP;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
