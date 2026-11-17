package com.hatch.browser.protocol;

import com.hatch.browser.protocol.UniffiForeignFutureResultVoid;
import com.sun.jna.Callback;

/* loaded from: classes6.dex */
public interface UniffiForeignFutureCompleteVoid extends Callback {
    void callback(long j, UniffiForeignFutureResultVoid.UniffiByValue uniffiByValue);
}
