package com.company;

public class LinkedList<T> {
    Node<T> head;

    void add(T elem) {

    }

    T get(int i) {
        return null;
    }

    private class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }

        Node<T> getNext() {
            return next;
        }
    }
}
