package com.hatch.browser.protocol;

import com.hatch.browser.protocol.UniffiForeignFutureResultI32;
import com.sun.jna.Callback;

/* loaded from: classes6.dex */
public interface UniffiForeignFutureCompleteI32 extends Callback {
    void callback(long j, UniffiForeignFutureResultI32.UniffiByValue uniffiByValue);
}
