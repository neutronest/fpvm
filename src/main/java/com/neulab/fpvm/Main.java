package com.neulab.fpvm;

import com.neulab.fpvm.objectalgreba.ExpAlg;
import com.neulab.fpvm.visiterpattern.*;

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
        // basic +
        VisitorIntFnFactory visitorIntFnFactory = new VisitorIntFnFactory();
        VisitorLitExp v1 = new VisitorLitExp(1);
        VisitorLitExp v2 = new VisitorLitExp(2);
        VisitorAddExp e1 = new VisitorAddExp(v1, v2);
        System.out.println("VisitorPattern 1+2 result: " + e1.accept(visitorIntFnFactory));
        // basic *
        VisitorLitExp v3 = new VisitorLitExp(3);
        VisitorMulExp e2 = new VisitorMulExp(e1, v3);
        System.out.println("VisitorPattern (1+2)*3 result: " + e2.accept(visitorIntFnFactory));
        // basic print
        System.out.println("PPrint: " + e2.print(visitorIntFnFactory));

    }
}