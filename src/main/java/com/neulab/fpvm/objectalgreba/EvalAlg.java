package com.neulab.fpvm.objectalgreba;

public class EvalAlg implements ExpAlg<Eval> {
    public Eval lit(final int n) {
        return new Eval() {
            public int eval() {
                return n;
            }
        };
    }

    public Eval add(final Eval x, final Eval y) {
        return new Eval() {
            public int eval() {
                return x.eval() + y.eval();
            }
        };
    }
}
