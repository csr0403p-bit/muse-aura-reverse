package com.hatch.browser.core;

import com.hatch.browser.core.UniffiForeignFutureResultI64;
import com.sun.jna.Callback;

/* loaded from: classes6.dex */
public interface UniffiForeignFutureCompleteI64 extends Callback {
    void callback(long j, UniffiForeignFutureResultI64.UniffiByValue uniffiByValue);
}
