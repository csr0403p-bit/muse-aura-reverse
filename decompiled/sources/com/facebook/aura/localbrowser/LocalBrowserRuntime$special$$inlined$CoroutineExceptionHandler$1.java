package com.facebook.aura.localbrowser;

import X.C78T;
import X.C78p;
import X.CFK;
import X.HqU;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public final class LocalBrowserRuntime$special$$inlined$CoroutineExceptionHandler$1 extends HqU implements CoroutineExceptionHandler {
    public final /* synthetic */ LocalBrowserRuntime this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserRuntime$special$$inlined$CoroutineExceptionHandler$1(C78p c78p, LocalBrowserRuntime localBrowserRuntime) {
        super(c78p);
        this.this$0 = localBrowserRuntime;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(C78T c78t, Throwable th) {
        this.this$0.disableAfterCleanupFailure("cleanup_exception", th);
        CFK.A0A(LocalBrowserRuntime.TAG, "Browser cleanup failed", th);
    }
}
