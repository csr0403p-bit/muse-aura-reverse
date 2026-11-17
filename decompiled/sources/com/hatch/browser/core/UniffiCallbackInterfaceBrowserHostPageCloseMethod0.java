package com.hatch.browser.core;

import com.hatch.browser.protocol.RustBuffer;
import com.sun.jna.Callback;

/* loaded from: classes6.dex */
public interface UniffiCallbackInterfaceBrowserHostPageCloseMethod0 extends Callback {
    void callback(long j, RustBuffer.ByValue byValue, UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j2, UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct);
}
