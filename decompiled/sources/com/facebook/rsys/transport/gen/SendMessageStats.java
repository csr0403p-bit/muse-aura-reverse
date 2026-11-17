package com.facebook.rsys.transport.gen;

import X.C8922Fte;
import X.G50;
import X.GUi;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public class SendMessageStats {
    public static G50<SendMessageStats> CONVERTER = C8922Fte.A00(33);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native SendMessageStats createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(short s, long j, long j2, long j3, boolean z, int i, String str, int i2, int i3, long j4, ChatdSendStats chatdSendStats);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native short getAttemptsNumber();

    public native ChatdSendStats getChatdStats();

    public native long getEnqueueTimestampMs();

    public native int getErrorCode();

    public native String getErrorMessage();

    public native boolean getIsSuccess();

    public native int getNetworkType();

    public native long getOutBytesWritten();

    public native long getPublishTimestampMs();

    public native long getTimeSinceAppInitMs();

    public native int getTransportChannel();

    public native int hashCode();

    public native String toString();

    static {
        GUi.A00();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SendMessageStats)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public SendMessageStats(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public SendMessageStats(short s, long j, long j2, long j3, boolean z, int i, String str, int i2, int i3, long j4, ChatdSendStats chatdSendStats) {
        this.mNativeHolder = initNativeHolder(s, j, j2, j3, z, i, str, i2, i3, j4, chatdSendStats);
    }
}
