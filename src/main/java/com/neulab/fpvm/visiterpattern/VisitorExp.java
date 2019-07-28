package com.neulab.fpvm.visiterpattern;

public interface VisitorExp<T> {
    T accept(VisitorFn<T> visitorFn);
    String print(VisitorFn<T> visitorFn);
}
