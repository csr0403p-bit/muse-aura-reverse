package com.facebook.msys.mci;

import X.C7320Ekq;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes5.dex */
public class RedactedString {
    public NativeHolder mNativeHolder;

    private native boolean equalsNative(Object obj);

    public static native NativeHolder initNativeHolder(String str);

    public static native NativeHolder initNativeHolder(String str, int i);

    public native String getOriginalString();

    public native int hashCode();

    public native int leakAllowance();

    public native String toString();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof RedactedString)) {
            return false;
        }
        return equalsNative(obj);
    }

    static {
        C7320Ekq.A00();
    }

    public RedactedString(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
