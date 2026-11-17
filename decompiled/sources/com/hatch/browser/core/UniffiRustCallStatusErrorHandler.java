package com.hatch.browser.core;

import com.hatch.browser.core.RustBuffer;

/* loaded from: classes6.dex */
public interface UniffiRustCallStatusErrorHandler<E> {
    E lift(RustBuffer.ByValue byValue);
}
