package com.company;

public class Stack {
    private String[] elements;
    private int count;

    public Stack(int capacity) {
        elements = new String[capacity];
        count = 0;
    }

    public Stack() {
    }

    void push(String elem) {
        elements[count] = elem;
        count++;
    }

    //FIXME ArrayIndexOutOfBound при попытке достать элемент из пустого стека
    String pop() {
        String elemToReturn = elements[count - 1];
        count--;
        return elemToReturn;
    }

    int size(){
        //todo вернуть кол-во элементов в стеке
        return 0;
    }
}








