package com.sun.jna.ptr;

import X.BV7;
import com.sun.jna.Pointer;

/* loaded from: classes5.dex */
public class DoubleByReference extends ByReference {
    public DoubleByReference(double d) {
        super(8);
        setValue(d);
    }

    public double getValue() {
        return this.pointer.getDouble(0L);
    }

    public void setValue(double d) {
        this.pointer.setDouble(0L, d);
    }

    @Override // com.sun.jna.ptr.ByReference, com.sun.jna.PointerType
    public String toString() {
        Pointer pointer = this.pointer;
        return String.format("double@0x%x=%s", Long.valueOf(BV7.A0V(pointer)), Double.valueOf(pointer.getDouble(0L)));
    }

    public DoubleByReference() {
        this(0.0d);
    }
}
