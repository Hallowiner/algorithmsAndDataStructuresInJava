package com.practica.java.sorting;

public class Partitioning {


    public int[] partitionIt(int[] array, int left, int right) {
        int leftPtr = left - 1;
        int rightPtr = right + 1;
        int pivot = array[right];

        while (true) {
            while (leftPtr < right && array[++leftPtr] < pivot) ;

            while (rightPtr > left && array[--rightPtr] > pivot) ;

            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(array, leftPtr, rightPtr);
            }
        }
        System.out.println("Pivot: " + pivot);
        return array;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
