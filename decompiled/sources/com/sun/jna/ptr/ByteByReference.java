package com.sun.jna.ptr;

import X.BV7;
import com.sun.jna.Pointer;

/* loaded from: classes5.dex */
public class ByteByReference extends ByReference {
    public ByteByReference(byte b) {
        super(1);
        setValue(b);
    }

    public byte getValue() {
        return this.pointer.getByte(0L);
    }

    public void setValue(byte b) {
        this.pointer.setByte(0L, b);
    }

    @Override // com.sun.jna.ptr.ByReference, com.sun.jna.PointerType
    public String toString() {
        Pointer pointer = this.pointer;
        return String.format("byte@0x%1$x=0x%2$x (%2$d)", Long.valueOf(BV7.A0V(pointer)), Byte.valueOf(pointer.getByte(0L)));
    }

    public ByteByReference() {
        this((byte) 0);
    }
}
