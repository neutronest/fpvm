package com.neulab.fpvm.objectalgreba;

public class Add implements Exp {

    Exp x, y;

    public Add(Exp x, Exp y) {
        this.x = x;
        this.y = y;
    }

    public int eval() {
        return x.eval() + y.eval();
    }
}
