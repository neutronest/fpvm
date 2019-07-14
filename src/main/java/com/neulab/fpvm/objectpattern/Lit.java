package com.neulab.fpvm.objectalgreba;

public class Lit implements Exp {

    private int n;

    public Lit(int num) {
        n = num;
    }

    public int eval() {
        return n;
    }
}
