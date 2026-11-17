package com.facebook.rsys.transport.gen;

import X.C8922Fte;
import X.G50;
import X.GUi;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public class StatusUpdate {
    public static G50<StatusUpdate> CONVERTER = C8922Fte.A00(41);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native StatusUpdate createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(int i);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native int getSessionsCount();

    public native int hashCode();

    public native String toString();

    static {
        GUi.A00();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StatusUpdate)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public StatusUpdate(int i) {
        this.mNativeHolder = initNativeHolder(i);
    }

    public StatusUpdate(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
