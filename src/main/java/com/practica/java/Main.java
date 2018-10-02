package com.practica.java;

import com.practica.java.array.HighArray;

public class Main {

    public static void main(String[] args) {

        int maxSize = 100;
        HighArray array = new HighArray(maxSize);

        array.insert(9);
        array.insert(45);
        array.insert(51);
        array.insert(75);
        array.insert(42);
        array.insert(32);
        array.insert(2);
        array.insert(65);
        array.insert(38);
        array.insert(90);

        array.display();

        int searchKey = 7;


        array.delete(8);
        array.delete(42);
        array.delete(65);

        array.display();

    }
}
