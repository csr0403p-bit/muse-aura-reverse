package com.crossapp.tigonhttp.websocket;

import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public final class TigonHttpWebSocket {
    public static final TigonHttpWebSocket $redex_init_class = null;
    public final HybridData mHybridData;

    public TigonHttpWebSocket(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }

    private final native void cancelNative();

    private final native boolean closeNative(int i, String str);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native long outboundBufferedBytesNative();

    private final native boolean sendBinaryNative(byte[] bArr);

    private final native boolean sendTextNative(String str);

    private final native void setOutboundCapacityNative(long j, long j2);

    public final boolean close(int i, String str) {
        C7384Etj.A0Y(str, 1);
        return closeNative(i, str);
    }

    public final boolean send(String str) {
        C7384Etj.A0Y(str, 0);
        return sendTextNative(str);
    }

    static {
        ETi.loadLibrary("tigonhttpwebsocket-jni");
    }

    public final void cancel() {
        cancelNative();
    }

    public final Long outboundBufferedBytes() {
        long jOutboundBufferedBytesNative = outboundBufferedBytesNative();
        Long lValueOf = Long.valueOf(jOutboundBufferedBytesNative);
        if (jOutboundBufferedBytesNative < 0) {
            return null;
        }
        return lValueOf;
    }

    public final void setOutboundCapacity(long j, long j2) {
        setOutboundCapacityNative(j, j2);
    }

    public final boolean send(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return sendBinaryNative(bArr);
    }
}
