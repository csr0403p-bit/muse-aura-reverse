package com.facebook.rsys.transport.gen;

import X.C8922Fte;
import X.G50;
import X.GUi;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public class ChatdSendStats {
    public static G50<ChatdSendStats> CONVERTER = C8922Fte.A00(29);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native ChatdSendStats createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(String str, long j, long j2, long j3, String str2, boolean z, int i);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native long getCatExpiryS();

    public native long getConnectionId();

    public native String getConnectionState();

    public native String getDisconnectFlags();

    public native boolean getIsRetryableMessage();

    public native long getLastConnectedTimeMs();

    public native int getMaxRetryCount();

    public native int hashCode();

    public native String toString();

    static {
        GUi.A00();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ChatdSendStats)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public ChatdSendStats(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public ChatdSendStats(String str, long j, long j2, long j3, String str2, boolean z, int i) {
        str.getClass();
        str2.getClass();
        this.mNativeHolder = initNativeHolder(str, j, j2, j3, str2, z, i);
    }
}
