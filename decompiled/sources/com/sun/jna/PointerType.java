package com.sun.jna;

import X.C60R;
import X.F60;

/* loaded from: classes5.dex */
public abstract class PointerType implements NativeMapped {
    public Pointer pointer;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof PointerType) {
                Pointer pointer = ((PointerType) obj).pointer;
                Pointer pointer2 = this.pointer;
                if (pointer2 != null) {
                    return pointer2.equals(pointer);
                }
                if (pointer == null) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.sun.jna.NativeMapped
    public Object fromNative(Object obj, FromNativeContext fromNativeContext) {
        if (obj == null) {
            return null;
        }
        PointerType pointerType = (PointerType) Klass.newInstance(getClass());
        pointerType.pointer = (Pointer) obj;
        return pointerType;
    }

    public Pointer getPointer() {
        return this.pointer;
    }

    public int hashCode() {
        return C60R.A01(this.pointer);
    }

    @Override // com.sun.jna.NativeMapped
    public Class<?> nativeType() {
        return Pointer.class;
    }

    @Override // com.sun.jna.NativeMapped
    public Object toNative() {
        return this.pointer;
    }

    public PointerType(Pointer pointer) {
        this.pointer = pointer;
    }

    public void setPointer(Pointer pointer) {
        this.pointer = pointer;
    }

    public String toString() {
        throw F60.createAndThrow();
    }

    public PointerType() {
        this.pointer = Pointer.NULL;
    }
}
