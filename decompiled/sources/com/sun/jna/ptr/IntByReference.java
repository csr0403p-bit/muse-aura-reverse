package com.sun.jna.ptr;

import X.BV5;
import X.BV7;
import com.sun.jna.Pointer;

/* loaded from: classes5.dex */
public class IntByReference extends ByReference {
    public IntByReference(int i) {
        super(4);
        setValue(i);
    }

    public int getValue() {
        return this.pointer.getInt(0L);
    }

    public void setValue(int i) {
        this.pointer.setInt(0L, i);
    }

    @Override // com.sun.jna.ptr.ByReference, com.sun.jna.PointerType
    public String toString() {
        Pointer pointer = this.pointer;
        return String.format("int@0x%1$x=0x%2$x (%2$d)", BV5.A1a(Long.valueOf(BV7.A0V(pointer)), pointer.getInt(0L)));
    }

    public IntByReference() {
        this(0);
    }
}
