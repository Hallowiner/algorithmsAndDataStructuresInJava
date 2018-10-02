package com.practica.java;

public class PersonArray {

    private Person[] personArray;
    private int amount;

    public PersonArray(int size) {
        personArray = new Person[size];
        amount = 0;
    }

    public void insert(Person person) {
        personArray[amount] = person;
        amount++;
    }

    public void delete(Person person) {
        for (int i = 0; i < amount; i++) {
            if (personArray[i].getLastName().equals(person.getLastName())) {

            }
        }
    }

    public Person find(String lastName) {
        //Busqueda linear
        /*
        for (int i = 0; i < amount; i++) {
            if (personArray[i].getLastName().equals(lastName)) {
                return personArray[i];
            }
        }
        return null;
        */
        //Busqueda binaria
        int limSup = 0;
        int limInf = amount -1;

        while(true) {
            int mitad = (limSup + limInf) / 2;

            if (personArray[mitad].getLastName().equals(lastName)) {
                return personArray[mitad];
            }
            if (limInf > limSup) {
                return null;
            }
            if (personArray[mitad].getLastName().compareTo(lastName) < 0) {
                limInf = mitad - 1;
            } else {// if(personArray[mitad].getLastName().compareTo(lastName) > 0)
                limSup = mitad - 1;
            }
        }

    }

}
