package com.sun.jna.ptr;

import X.C3cI;
import X.C60Q;
import com.sun.jna.Memory;
import com.sun.jna.Pointer;
import com.sun.jna.PointerType;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public abstract class ByReference extends PointerType {
    public ByReference(int i) {
        this.pointer = new Memory(i);
    }

    @Override // com.sun.jna.PointerType
    public String toString() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = getClass().getMethod("getValue", null).invoke(this, null);
            if (objInvoke == null) {
                Pointer pointer = this.pointer;
                return String.format("null@0x%x", Long.valueOf(pointer == null ? 0L : pointer.peer));
            }
            String strA0Y = C3cI.A0Y(objInvoke);
            Pointer pointer2 = this.pointer;
            return String.format("%s@0x%x=%s", strA0Y, Long.valueOf(pointer2 == null ? 0L : pointer2.peer), objInvoke);
        } catch (Exception e) {
            return String.format("ByReference Contract violated - %s#getValue raised exception: %s", C60Q.A0e(this), e.getMessage());
        }
    }
}
