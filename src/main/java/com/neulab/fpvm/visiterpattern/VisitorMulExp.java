package com.neulab.fpvm.visiterpattern;

public class VisitorMulExp implements VisitorExp<Integer> {

    public VisitorExp<Integer> e1, e2;

    public VisitorMulExp(VisitorExp e1, VisitorExp e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
    public Integer accept(VisitorFn<Integer> visitorFn) {
        return visitorFn.mul(e1.accept(visitorFn), e2.accept(visitorFn));
    }


    public String print(VisitorFn<Integer> visitorFn) {
        return "(" + e1.print(visitorFn) + " * " + e2.print(visitorFn) + ")";
    }
}
