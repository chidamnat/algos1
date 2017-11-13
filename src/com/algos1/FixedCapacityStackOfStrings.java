package com.algos1;

/**
 * Created by chidam on 11/11/17.
 */
public class FixedCapacityStackOfStrings {
    private String[] s;
    private int N=0;

    public FixedCapacityStackOfStrings(int capacity) {
        s = new String[capacity];
    }

    public boolean isEmpty() { return N==0; }

    public void push(String item) {
        s[N++] = item;
    }

    public String pop() {
        return s[--N];
    }
}
