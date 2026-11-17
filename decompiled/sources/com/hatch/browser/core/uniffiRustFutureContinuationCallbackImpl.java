package com.hatch.browser.core;

/* loaded from: classes6.dex */
public final class uniffiRustFutureContinuationCallbackImpl implements UniffiRustFutureContinuationCallback {
    public static final int $stable = 0;
    public static final uniffiRustFutureContinuationCallbackImpl INSTANCE = new uniffiRustFutureContinuationCallbackImpl();

    @Override // com.hatch.browser.core.UniffiRustFutureContinuationCallback
    public void callback(long j, byte b) {
        Hatch_browser_core_uniffiKt.uniffiContinuationHandleMap.remove(j).resumeWith(Byte.valueOf(b));
    }
}
