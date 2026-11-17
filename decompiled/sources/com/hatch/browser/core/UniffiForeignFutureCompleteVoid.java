package com.hatch.browser.core;

import com.hatch.browser.core.UniffiForeignFutureResultVoid;
import com.sun.jna.Callback;

/* loaded from: classes6.dex */
public interface UniffiForeignFutureCompleteVoid extends Callback {
    void callback(long j, UniffiForeignFutureResultVoid.UniffiByValue uniffiByValue);
}
