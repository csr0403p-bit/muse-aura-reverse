package com.facebook.rsys.transport.gen;

import X.C8922Fte;
import X.G50;
import X.GUi;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public class SendMessageAttemptStats {
    public static G50<SendMessageAttemptStats> CONVERTER = C8922Fte.A00(32);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native SendMessageAttemptStats createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(short s, long j, int i, int i2, int i3, int i4, long j2, ChatdSendStats chatdSendStats, String str);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native short getAttemptsNumber();

    public native ChatdSendStats getChatdStats();

    public native String getDgwConnectivityStatus();

    public native int getNetworkType();

    public native long getOutBytesWritten();

    public native int getResult();

    public native long getTimeSinceAppInitMs();

    public native int getTransportChannel();

    public native int getTransportState();

    public native int hashCode();

    public native String toString();

    static {
        GUi.A00();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SendMessageAttemptStats)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public SendMessageAttemptStats(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public SendMessageAttemptStats(short s, long j, int i, int i2, int i3, int i4, long j2, ChatdSendStats chatdSendStats, String str) {
        this.mNativeHolder = initNativeHolder(s, j, i, i2, i3, i4, j2, chatdSendStats, str);
    }
}
