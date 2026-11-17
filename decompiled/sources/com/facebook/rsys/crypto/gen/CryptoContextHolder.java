package com.facebook.rsys.crypto.gen;

import X.C8926Fti;
import X.G50;
import X.GZ8;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public class CryptoContextHolder {
    public static G50<CryptoContextHolder> CONVERTER = C8926Fti.A00(43);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native CryptoContextHolder createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(McfReference mcfReference);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native McfReference getContext();

    public native int hashCode();

    public native String toString();

    static {
        GZ8.A00();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CryptoContextHolder)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public CryptoContextHolder(McfReference mcfReference) {
        mcfReference.getClass();
        this.mNativeHolder = initNativeHolder(mcfReference);
    }

    public CryptoContextHolder(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
