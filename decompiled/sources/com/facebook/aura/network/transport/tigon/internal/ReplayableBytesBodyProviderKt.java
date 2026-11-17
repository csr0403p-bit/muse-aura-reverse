package com.facebook.aura.network.transport.tigon.internal;

import X.AnonymousClass005;
import com.facebook.tigon.TigonBodyStream;

/* loaded from: classes5.dex */
public abstract class ReplayableBytesBodyProviderKt {
    public static final int CHUNK_SIZE = 4096;

    public static /* synthetic */ void writeReplayableBytes$default(TigonBodyStream tigonBodyStream, byte[] bArr, NoisePauseGate noisePauseGate, int i, Object obj) {
        if ((i & 4) != 0) {
            noisePauseGate = new NoisePauseGate();
        }
        writeReplayableBytes(tigonBodyStream, bArr, noisePauseGate);
    }

    public static final void writeReplayableBytes(TigonBodyStream tigonBodyStream, byte[] bArr, NoisePauseGate noisePauseGate) {
        boolean zA1Z = AnonymousClass005.A1Z(tigonBodyStream, bArr, noisePauseGate);
        try {
            noisePauseGate.captureWriterThread();
            int length = bArr.length;
            tigonBodyStream.reportBodyLength(length);
            int i = 0;
            while (i < length) {
                int iMin = Math.min(CHUNK_SIZE, length - i);
                TigonMultipartStreamingProviderKt.awaitResume(noisePauseGate, 0L);
                if (zA1Z == tigonBodyStream.transferBytes(bArr, i, iMin)) {
                    return;
                } else {
                    i += iMin;
                }
            }
            TigonMultipartStreamingProviderKt.awaitResume(noisePauseGate, 0L);
            tigonBodyStream.writeEOM();
        } catch (Throwable unused) {
        }
    }
}
