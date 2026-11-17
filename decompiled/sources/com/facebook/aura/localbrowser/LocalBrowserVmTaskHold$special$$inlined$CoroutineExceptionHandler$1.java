package com.facebook.aura.localbrowser;

import X.C78T;
import X.C78p;
import X.CFK;
import X.HqU;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public final class LocalBrowserVmTaskHold$special$$inlined$CoroutineExceptionHandler$1 extends HqU implements CoroutineExceptionHandler {
    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(C78T c78t, Throwable th) {
        CFK.A0A("LocalBrowserVmTaskHold", "VM task hold failed", th);
    }

    public LocalBrowserVmTaskHold$special$$inlined$CoroutineExceptionHandler$1(C78p c78p) {
        super(c78p);
    }
}
