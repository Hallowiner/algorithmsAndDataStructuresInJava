package com.practica.java.array;

public class HighArray {
    private int[] array;
    private int size;

    public HighArray(int maxSize) {
        array = new int[maxSize];
        size = 0;
    }

    public void insert(int numb) {
        /*
        this.array[size] = numb;
        size++;
        */
        //Ordenado ascendentemente con busqueda lineal
        /*
        int[] arrayNuevo = new int[array.length];
        int arrayNuevoPos = 0;
        boolean agregado = false;
        //1- recorro array
        for(int i=0; i < size; i++) {
            //2- valido si posActual es mayor que numb
            if(array[i] > numb) {
                //3- si lo es agrego numb a nuevo array
                arrayNuevo[arrayNuevoPos] = numb;
                arrayNuevoPos++;
                agregado = true;
            }
            //4- agrego posActual a nuevo array
            arrayNuevo[arrayNuevoPos] = array[i];
            arrayNuevoPos++;
        }
        //5- si llego al final sin agregar numb, se agrega al final
        if(!agregado) {
            arrayNuevo[arrayNuevoPos] = numb;
        }
        size++;
        */
        //Ordenado ascendentemente con busqueda binaria
        int pos = find(numb);
        if (pos < size) {//3
            for (int i = size + 1; i != pos; i--) {
                array[i] = array[i - 1];
            }
        }
        array[pos] = numb;
        size++;

    }

    public void delete(int numb) {
        //con buqueda lineal
        /*
        int[] a = new int[array.length];
        int pos = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == numb) {
                //encontrado: salteado
                pos++;
                size--;
            }
            a[i] = array[pos];
            pos++;
        }
        this.array = a;
        size--;
        */
        //con busqueda binaria
        //1- busco donde esta elemento a borrar
        int pos = find(numb);
        //2- si No esta, salgo
        if(pos == size) {
            return;//no esta, no borro
        }
        //3- Si esta, ignoro pos
        //5- copio en array hasta fin
        for(int i = pos; i < size; i++) {
            array[i] = array[i+1];
        }
        size--;
    }

    public int find(int numb) {
        //linear
        /*for (int i = 0; i < size; i++) {
            if (this.array[i] == numb) {
                return true;
            }
        }
        return false;*/

        //binaria
        //1- setear limite sup e inf
        int limSup = 0;
        int limInf = size - 1;

        while (true) {
            //2- definir la mitad de los limites
            int mitad = (limSup + limInf) / 2;
            //3 - determminar si el elemento esta en la mitad
            if (array[mitad] == numb) {
                return mitad;//lo encontre, me voy!
            }
            //4- determino si no esta ni en la sup, ni en la inf
            if (limSup > limInf) {
                return size;
            }
            //5- determinar si el elemento esta en la parte sup o inf
            if (numb < array[mitad]) {
                //esta sup
                limInf = mitad - 1;
            } else {//if (numb > array[mitad]) {
                //esta abajo
                limSup = mitad + 1;
            }
            //6- vuelvo a 2
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(this.array[i] + " ");
        }
    }

    public int getMax() {
        int max = -1;
        for(int i = 0; i < size; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}
