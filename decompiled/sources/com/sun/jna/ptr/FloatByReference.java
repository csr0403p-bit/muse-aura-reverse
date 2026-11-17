package com.sun.jna.ptr;

import X.BV7;
import com.sun.jna.Pointer;

/* loaded from: classes5.dex */
public class FloatByReference extends ByReference {
    public FloatByReference(float f) {
        super(4);
        setValue(f);
    }

    public float getValue() {
        return this.pointer.getFloat(0L);
    }

    public void setValue(float f) {
        this.pointer.setFloat(0L, f);
    }

    @Override // com.sun.jna.ptr.ByReference, com.sun.jna.PointerType
    public String toString() {
        Pointer pointer = this.pointer;
        return String.format("float@0x%x=%s", Long.valueOf(BV7.A0V(pointer)), Float.valueOf(pointer.getFloat(0L)));
    }

    public FloatByReference() {
        this(0.0f);
    }
}
