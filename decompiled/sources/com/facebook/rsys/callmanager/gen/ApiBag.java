package com.facebook.rsys.callmanager.gen;

import X.C8926Fti;
import X.G50;
import X.GUR;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

/* loaded from: classes6.dex */
public class ApiBag {
    public static G50<ApiBag> CONVERTER = C8926Fti.A00(31);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native ApiBag createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(Map<Long, McfReference> map, CallApi callApi);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native Map<Long, McfReference> getApis();

    public native CallApi getCall();

    public native int hashCode();

    public native String toString();

    static {
        GUR.A00();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ApiBag)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public ApiBag(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public ApiBag(Map<Long, McfReference> map, CallApi callApi) {
        map.getClass();
        callApi.getClass();
        this.mNativeHolder = initNativeHolder(map, callApi);
    }
}
