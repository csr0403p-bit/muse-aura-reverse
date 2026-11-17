package com.facebook.aura.network.transport;

import X.HtJ;

/* loaded from: classes2.dex */
public interface HatchDuplexHttpStream {
    Object awaitResponse(HtJ<? super HatchHttpResponse> htJ);

    void cancel();

    boolean finishRequest();

    Object writeRequestChunk(byte[] bArr, HtJ<? super Boolean> htJ);
}
