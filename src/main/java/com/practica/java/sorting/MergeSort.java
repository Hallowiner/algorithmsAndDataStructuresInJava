package com.practica.java.sorting;

import java.util.Arrays;

public class MergeSort {

    private int[] aux;

    public int[] sort(int[] array, int limSup, int limInf) {
        if(limInf == limSup) {
            int[] r = new int[1];
            r[0] = array[limInf];
            return r;
        }
        int medio = (limInf + limSup)/2;
        int[] parteA = sort(array, limSup, medio);
        int[] parteB = sort(array, medio+1, limInf);
        System.out.println("Parte A: " + Arrays.toString(parteA));
        System.out.println("Parte B: " + Arrays.toString(parteB));
        return merge(parteA, parteB);
    }

    private int[] merge(int[] arrayA, int[] arrayB) {
        int a = 0;
        int b = 0;
        int[] result = new int[arrayA.length + arrayB.length];
        int r = 0;
        while (a < arrayA.length && b < arrayB.length) {
            if (arrayA[a] < arrayB[b]) {
                result[r++] = arrayA[a++];
            } else {
                result[r++] = arrayB[b++];
            }
        }
        while (a < arrayA.length) {
            result[r++] = arrayA[a++];
        }
        while (b < arrayB.length) {
            result[r++] = arrayB[b++];
        }
        return result;
    }
}
