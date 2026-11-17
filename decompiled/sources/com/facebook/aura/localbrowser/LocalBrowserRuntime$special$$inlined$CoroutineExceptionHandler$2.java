package com.facebook.aura.localbrowser;

import X.C78T;
import X.C78p;
import X.CFK;
import X.HqU;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public final class LocalBrowserRuntime$special$$inlined$CoroutineExceptionHandler$2 extends HqU implements CoroutineExceptionHandler {
    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(C78T c78t, Throwable th) {
        CFK.A0A(LocalBrowserRuntime.TAG, "Browser service handling failed", th);
    }

    public LocalBrowserRuntime$special$$inlined$CoroutineExceptionHandler$2(C78p c78p) {
        super(c78p);
    }
}
