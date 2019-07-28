package com.neulab.fpvm.visiterpattern;

public class VisitorLitExp implements VisitorExp<Integer> {

    public Integer x;

    public VisitorLitExp(Integer x) {
        this.x = x;
    }

    public Integer accept(VisitorFn<Integer> visitorFn) {
        return visitorFn.lit(x);
    }

    public String print(VisitorFn<Integer> visitorFn) {
        return x.toString();
    }
}
