package com.neulab.fpvm.objectpattern;

public class BasicLit implements BasicExp {

    public int x;

    public BasicLit(int x) {
        this.x = x;
    }

    public BasicValue eval() {
        return new BasicVInt(x);
    }
}
