package com.facebook.aura.composer.dictation.vm;

import X.C78T;
import X.C78p;
import X.CFK;
import X.HqU;
import com.facebook.aura.composer.dictation.engine.DictationOutcome;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public final class VmDictationClient$special$$inlined$CoroutineExceptionHandler$1 extends HqU implements CoroutineExceptionHandler {
    public final /* synthetic */ VmDictationClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VmDictationClient$special$$inlined$CoroutineExceptionHandler$1(C78p c78p, VmDictationClient vmDictationClient) {
        super(c78p);
        this.this$0 = vmDictationClient;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(C78T c78t, Throwable th) {
        CFK.A0A(VmDictationClient.TAG, "VM dictation stream failed", th);
        this.this$0.finish(DictationOutcome.FAILED, "stream_failed");
    }
}
