package com.practica.java.sorting;

public class Bubble {

    public int[] sortRecursivo(int[] array, int amount) {
        int aux;
        boolean ordenado = true;
        //1- obtengo 2 elementos
        for(int i=0; i < amount; i++) {
            //2- si 1ero es mayor q 2do, intercambio
            if (array[i] > array[i + 1]) {
                aux = array[i];
                array[i] = array[i + 1];
                array[i + 1] = aux;
                ordenado = false;
            }
            //3- avanzo 1 posicion
        }
        //4- vuelvo a 1

        //5- si intercambie, repito
        if(!ordenado) {
            return sort(array, amount-1);//recursivo
        }
        //5- repito
        return array;
    }

    public int[] sort(int[] array, int amount) {
        int aux;
        for(int u = amount; u > 1; u--) {
            //1- obtengo 2 elementos
            for (int i = 0; i < u; i++) {
                //2- si 1ero es mayor q 2do, intercambio
                if (array[i] > array[i + 1]) {
                    aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                }
                //3- avanzo 1 posicion
            }
            //4- vuelvo a 1
        }
        return array;
    }
}
