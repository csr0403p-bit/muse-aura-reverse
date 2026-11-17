package com.hatch.browser.protocol;

import com.hatch.browser.protocol.RustBuffer;

/* loaded from: classes6.dex */
public interface UniffiRustCallStatusErrorHandler<E> {
    E lift(RustBuffer.ByValue byValue);
}
