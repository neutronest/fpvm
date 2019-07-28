package com.neulab.fpvm.visiterpattern;

public interface VisitorFn<T> {

    T lit(T a);
    T add(T a1, T a2);
    T mul(T a1, T a2);
}
