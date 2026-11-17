package com.sun.jna.ptr;

import X.BV4;
import X.BV7;
import com.sun.jna.Pointer;

/* loaded from: classes5.dex */
public class LongByReference extends ByReference {
    public LongByReference(long j) {
        super(8);
        setValue(j);
    }

    public long getValue() {
        return this.pointer.getLong(0L);
    }

    public void setValue(long j) {
        this.pointer.setLong(0L, j);
    }

    @Override // com.sun.jna.ptr.ByReference, com.sun.jna.PointerType
    public String toString() {
        Pointer pointer = this.pointer;
        return String.format("long@0x%1$x=0x%2$x (%2$d)", BV4.A1Y(Long.valueOf(BV7.A0V(pointer)), pointer.getLong(0L)));
    }

    public LongByReference() {
        this(0L);
    }
}
