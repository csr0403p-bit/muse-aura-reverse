package com.facebook.aura.network.transport;

import X.HtJ;

/* loaded from: classes5.dex */
public interface HatchScopedVmChannel {
    Object awaitClosed(HtJ<? super HatchWsEvent> htJ);

    Object awaitReady(long j, HtJ<? super HatchWsEvent> htJ);

    void close();

    HatchHttpClient getHttpClient();

    boolean isOpen();
}
