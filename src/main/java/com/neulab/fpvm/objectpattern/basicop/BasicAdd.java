package com.neulab.fpvm.objectpattern.basicop;

import com.neulab.fpvm.objectpattern.BasicExp;
import com.neulab.fpvm.objectpattern.BasicValue;
import com.neulab.fpvm.objectpattern.basictype.BasicVInt;

public class BasicAdd implements BasicExp {

    public BasicExp e1, e2;

    public BasicAdd(BasicExp e1, BasicExp e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public BasicValue eval() {
        return new BasicVInt(e1.eval().getInt() + e2.eval().getInt());
    }

}
