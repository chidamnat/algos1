package com.algos1;

/**
 * Created by chidam on 11/11/17.
 */
public class StackOfStrings {
    private Node first = null;

    private class Node {
        String item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(String value) {
        Node oldFirst = first;
        first = new Node();
        first.item = value;
        first.next = oldFirst;
    }

    public String pop() {
        String item = first.item;
        first = first.next;
        return item;
    }
}
