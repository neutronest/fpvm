package com.neulab.fpvm.visiterpattern;

public class VisitorIntFnFactory implements VisitorFn<Integer> {
    public Integer lit(Integer a) {
        return a;
    }

    public Integer add(Integer a1, Integer a2) {
        return a1 + a2;
    }

    public Integer mul(Integer a1, Integer a2) {
        return a1 * a2;
    }

}
