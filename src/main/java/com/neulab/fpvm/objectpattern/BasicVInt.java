package com.neulab.fpvm.objectpattern;

public class BasicVInt implements BasicValue {

    public Integer x;

    public BasicVInt(Integer x) {
        this.x = x;
    }

    public Integer getInt() {
        return this.x;
    }

    public Boolean getBoolean() {
        return null;
    }

    public String getString() {
        return null;
    }
}
