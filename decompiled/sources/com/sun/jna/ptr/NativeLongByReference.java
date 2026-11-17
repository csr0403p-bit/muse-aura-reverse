package com.sun.jna.ptr;

import X.BV7;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;

/* loaded from: classes5.dex */
public class NativeLongByReference extends ByReference {
    public NativeLongByReference(NativeLong nativeLong) {
        super(NativeLong.SIZE);
        setValue(nativeLong);
    }

    public NativeLong getValue() {
        return this.pointer.getNativeLong(0L);
    }

    public void setValue(NativeLong nativeLong) {
        this.pointer.setNativeLong(0L, nativeLong);
    }

    @Override // com.sun.jna.ptr.ByReference, com.sun.jna.PointerType
    public String toString() {
        int i = NativeLong.SIZE;
        Pointer pointer = this.pointer;
        Long lValueOf = Long.valueOf(BV7.A0V(pointer));
        NativeLong nativeLong = pointer.getNativeLong(0L);
        return String.format("NativeLong@0x1$%x=0x%2$x (%2$d)", lValueOf, i > 4 ? Long.valueOf(nativeLong.value) : Integer.valueOf((int) nativeLong.value));
    }

    public NativeLongByReference() {
        this(new NativeLong(0L, false));
    }
}
