package com.neulab.fpvm.objectpattern;

import com.neulab.fpvm.objectpattern.Exp;

public class Lit implements Exp {

    private int n;

    public Lit(int num) {
        n = num;
    }

    public int eval() {
        return n;
    }
}
