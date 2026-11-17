package com.sun.jna.ptr;

import X.BV7;
import com.sun.jna.Pointer;

/* loaded from: classes5.dex */
public class ShortByReference extends ByReference {
    public ShortByReference(short s) {
        super(2);
        setValue(s);
    }

    public short getValue() {
        return this.pointer.getShort(0L);
    }

    public void setValue(short s) {
        this.pointer.setShort(0L, s);
    }

    @Override // com.sun.jna.ptr.ByReference, com.sun.jna.PointerType
    public String toString() {
        Pointer pointer = this.pointer;
        return String.format("short@0x%1$x=0x%2$x (%2$d)", Long.valueOf(BV7.A0V(pointer)), Short.valueOf(pointer.getShort(0L)));
    }

    public ShortByReference() {
        this((short) 0);
    }
}
