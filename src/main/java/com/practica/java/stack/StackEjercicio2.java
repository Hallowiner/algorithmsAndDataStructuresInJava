package com.practica.java.stack;

public class StackEjercicio2 {

    private char[] array;
    private int size;
    private int top;

    public StackEjercicio2(int maxSize) {
        this.array = new char[maxSize];
        this.size = maxSize;
        this.top = -1;
    }

    public boolean delimiterMatch(String expression) {
        for (int i = 0; i < expression.length(); i++) {
            char elem = expression.charAt(i);
            switch (elem) {
                case '{':
                case '[':
                case '(':
                    push(expression.charAt(i));
                    break;
                case '}':
                case ']':
                case ')':
                    char c = pop();
                    if (elem == '}' && c != '{' ||
                            elem == ']' && c != '[' ||
                            elem == ')' && c != '(') {
                        return false;
                    }
                    break;
                    default: break;
            }
        }
        if(!isEmpty()) {
            return false;
        }
        return true;
    }

    public void push(char c) {
        array[++top] = c;
    }

    public char pop() {
        return array[top--];
    }

    public char peek() {
        return array[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size-1);
    }
}
