package com.algos1;

/**
 * Created by chidam on 10/29/17.
 */
public class QuickUnionUF {
    private int[] id;

    public QuickUnionUF (int N) {
        for(int i=0;i < N; i++) {
            id[i] = i;
        }
    }

    public int root(int i) {
        while(i != id[i]) i = id[i];
        return id[i];
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}
