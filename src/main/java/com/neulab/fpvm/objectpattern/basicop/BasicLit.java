package com.neulab.fpvm.objectpattern.basicop;

import com.neulab.fpvm.objectpattern.BasicExp;
import com.neulab.fpvm.objectpattern.basictype.BasicVInt;
import com.neulab.fpvm.objectpattern.BasicValue;

public class BasicLit implements BasicExp {

    public int x;

    public BasicLit(int x) {
        this.x = x;
    }

    public BasicValue eval() {
        return new BasicVInt(x);
    }
}
