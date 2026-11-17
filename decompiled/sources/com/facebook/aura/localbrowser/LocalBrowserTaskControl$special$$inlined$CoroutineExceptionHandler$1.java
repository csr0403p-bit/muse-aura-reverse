package com.facebook.aura.localbrowser;

import X.C78T;
import X.C78p;
import X.HqU;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public final class LocalBrowserTaskControl$special$$inlined$CoroutineExceptionHandler$1 extends HqU implements CoroutineExceptionHandler {
    public final /* synthetic */ LocalBrowserTaskControl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserTaskControl$special$$inlined$CoroutineExceptionHandler$1(C78p c78p, LocalBrowserTaskControl localBrowserTaskControl) {
        super(c78p);
        this.this$0 = localBrowserTaskControl;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(C78T c78t, Throwable th) {
        LocalBrowserTelemetry.INSTANCE.scopeFailure("task_control", th, this.this$0.task.id);
        LocalBrowserTaskControl.fail$default(this.this$0, false, 1, null);
    }
}
