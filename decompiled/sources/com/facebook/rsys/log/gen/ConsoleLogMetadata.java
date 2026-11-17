package com.facebook.rsys.log.gen;

import X.C8925Fth;
import X.G50;
import X.GZ3;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public class ConsoleLogMetadata {
    public static G50<ConsoleLogMetadata> CONVERTER = C8925Fth.A00(41);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native ConsoleLogMetadata createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(Long l, Integer num, Long l2, String str, String str2);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native Integer getConsoleLogId();

    public native String getLocalCallId();

    public native Long getTag();

    public native String getThreadId();

    public native Long getUtcTimestampUs();

    public native int hashCode();

    public native String toString();

    static {
        GZ3.A00();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ConsoleLogMetadata)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public ConsoleLogMetadata(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public ConsoleLogMetadata(Long l, Integer num, Long l2, String str, String str2) {
        this.mNativeHolder = initNativeHolder(l, num, l2, str, str2);
    }
}
