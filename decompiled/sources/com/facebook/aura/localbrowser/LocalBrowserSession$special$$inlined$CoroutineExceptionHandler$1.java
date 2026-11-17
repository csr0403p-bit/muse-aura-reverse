package com.facebook.aura.localbrowser;

import X.C78T;
import X.C78p;
import X.CFK;
import X.HqU;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public final class LocalBrowserSession$special$$inlined$CoroutineExceptionHandler$1 extends HqU implements CoroutineExceptionHandler {
    public final /* synthetic */ LocalBrowserSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserSession$special$$inlined$CoroutineExceptionHandler$1(C78p c78p, LocalBrowserSession localBrowserSession) {
        super(c78p);
        this.this$0 = localBrowserSession;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(C78T c78t, Throwable th) {
        CFK.A0A("LocalBrowserSession", "Browser session failed", th);
        LocalBrowserRuntime.Companion.getInstance(this.this$0.userSession).closeSession(this.this$0, LocalBrowserCloseReason.CONNECTION_FAILED);
    }
}
