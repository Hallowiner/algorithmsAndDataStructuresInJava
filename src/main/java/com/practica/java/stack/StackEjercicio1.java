package com.practica.java.stack;

public class StackEjercicio1 {

    private CharStack stack;


    public String reverse(String word) {
        this.stack = new CharStack(word.length());
        //hola -> aloh
        //1- recorro palabra
        for(int i = 0; i < word.length(); i++) {
            //2- inserto letra en stack
            stack.push(word.charAt(i));
        }
        //3- al terminar
        char[] reverted = new char[word.length()];
        //4- recorro stack
        for(int i = 0; i < word.length(); i++) {
            //5- extraigo letra
            reverted[i] = stack.pop();
        }
        //6- fin
        return String.copyValueOf(reverted);
    }
}
