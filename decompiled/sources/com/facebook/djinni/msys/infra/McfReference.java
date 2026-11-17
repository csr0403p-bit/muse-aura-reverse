package com.facebook.djinni.msys.infra;

import X.HVp;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public class McfReference {
    public static final HVp Companion = new HVp();
    public NativeHolder mNativeHolder;

    public static final native McfReference createEqualsForTest();

    public static final native McfReference createNotEqualsForTest();

    private final native boolean nativeEquals(Object obj);

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof McfReference)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public McfReference() {
        this.mNativeHolder = null;
    }

    public McfReference(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
