package com.practica.java.sorting;

public class InsertSort {

    public int[] sort(int[] array) {
        //1- selecciono posicion
        for (int mark = 1; mark < array.length; mark++) {
            //2- extraer elemento de posicion
            int aux = array[mark];
            int pos = mark;//mark - 1;
            //3- comparo elementos
            while(pos > 0 && array[pos-1] > aux) {
            //while (pos >= 0 && array[pos] > aux) {
                //4- si el elemento es mayor que mi elem, muevo uno
                array[pos] = array[pos -1];
                //5- retrocedo hasta 0
                pos--;
            }
            array[pos] = aux;
            //array[pos+1] = aux;
        }
        return array;
    }
}
