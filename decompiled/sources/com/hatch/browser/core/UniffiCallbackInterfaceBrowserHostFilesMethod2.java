package com.hatch.browser.core;

import com.hatch.browser.core.RustBuffer;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;

/* loaded from: classes6.dex */
public interface UniffiCallbackInterfaceBrowserHostFilesMethod2 extends Callback {
    void callback(long j, RustBuffer.ByValue byValue, Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus);
}
