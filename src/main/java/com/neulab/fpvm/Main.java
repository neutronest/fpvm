package com.neulab.fpvm;

import com.neulab.fpvm.objectalgreba.ExpAlg;
import com.neulab.fpvm.visiterpattern.VisitorAddExp;
import com.neulab.fpvm.visiterpattern.VisitorExp;
import com.neulab.fpvm.visiterpattern.VisitorIntFnFactory;
import com.neulab.fpvm.visiterpattern.VisitorLitExp;

class Op<T> {
    T e1 (ExpAlg<T> f) {
        return f.add(
                f.lit(1),
                f.add(f.lit(2), f.lit(3)));
    }
}

public class Main {

    public static void main(String... args) {
        System.out.println("Hello FP for JVM!");

        /* VisitorPattern

         */
        VisitorIntFnFactory visitorIntFnFactory = new VisitorIntFnFactory();
        VisitorLitExp v1 = new VisitorLitExp(1);
        VisitorLitExp v2 = new VisitorLitExp(2);
        VisitorAddExp e1 = new VisitorAddExp(v1, v2);
        System.out.println("VisitorPattern 1+2 result: " + e1.accept(visitorIntFnFactory));





    }
}