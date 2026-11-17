package com.hatch.browser.protocol;

import com.hatch.browser.protocol.UniffiForeignFutureResultI64;
import com.sun.jna.Callback;

/* loaded from: classes6.dex */
public interface UniffiForeignFutureCompleteI64 extends Callback {
    void callback(long j, UniffiForeignFutureResultI64.UniffiByValue uniffiByValue);
}
