package com.neulab.fpvm;

import com.neulab.fpvm.objectalgreba.Add;
import com.neulab.fpvm.objectalgreba.Lit;

public class Main {

    public static void main(String... args) {
        System.out.println("Hello FP for JVM!");

        Lit l1 = new Lit(2);
        Lit l2 = new Lit(3);

        Add addExp = new Add(l1, l2);
        System.out.println(addExp.eval());

    }
}