package com.algos1;

import java.util.Iterator;

/**
 * Created by chidam on 11/12/17.
 */
public class StackA<Item> implements Iterable<Item> {
    private Item[] s;
    private int N=0;

    public StackA(int capacity) {
        s = (Item[]) new Object[capacity];
    }

    public boolean isEmpty() { return s.length == 0;}

    public void push(Item item) {
        s[N++] = item;
    }

    public Item pop() { return s[--N]; }

    public Iterator<Item> iterator() { return new ReverseArrayIterator(); }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = N;
        public boolean hasNext() { return i==0; }

        public Item next() {
            return s[--i];
        }
     }
}
