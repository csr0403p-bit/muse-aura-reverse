package com.facebook.aura.localbrowser;

import X.C78T;
import X.C78p;
import X.HqU;
import com.facebook.acra.constants.ErrorReportingConstants;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public final class LocalBrowserEndpoint$special$$inlined$CoroutineExceptionHandler$1 extends HqU implements CoroutineExceptionHandler {
    public final /* synthetic */ LocalBrowserEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserEndpoint$special$$inlined$CoroutineExceptionHandler$1(C78p c78p, LocalBrowserEndpoint localBrowserEndpoint) {
        super(c78p);
        this.this$0 = localBrowserEndpoint;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(C78T c78t, Throwable th) {
        LocalBrowserTelemetry.INSTANCE.scopeFailure(ErrorReportingConstants.ENDPOINT, th, null);
        this.this$0.stopOwnedTasks(LocalBrowserTaskOutcome.BROWSER_LOST);
        this.this$0.close();
    }
}
