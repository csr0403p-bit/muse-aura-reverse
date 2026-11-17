package com.sun.jna.ptr;

import com.sun.jna.Native;
import com.sun.jna.Pointer;

/* loaded from: classes5.dex */
public class PointerByReference extends ByReference {
    public PointerByReference(Pointer pointer) {
        super(Native.POINTER_SIZE);
        setValue(pointer);
    }

    public Pointer getValue() {
        return this.pointer.getPointer(0L);
    }

    public void setValue(Pointer pointer) {
        this.pointer.setPointer(0L, pointer);
    }

    public PointerByReference() {
        this(null);
    }
}
