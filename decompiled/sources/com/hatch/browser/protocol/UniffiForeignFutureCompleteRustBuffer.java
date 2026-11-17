package com.hatch.browser.protocol;

import com.hatch.browser.protocol.UniffiForeignFutureResultRustBuffer;
import com.sun.jna.Callback;

/* loaded from: classes6.dex */
public interface UniffiForeignFutureCompleteRustBuffer extends Callback {
    void callback(long j, UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue);
}
