package com.hatch.browser.protocol;

import com.hatch.browser.protocol.UniffiForeignFutureResultF32;
import com.sun.jna.Callback;

/* loaded from: classes6.dex */
public interface UniffiForeignFutureCompleteF32 extends Callback {
    void callback(long j, UniffiForeignFutureResultF32.UniffiByValue uniffiByValue);
}
