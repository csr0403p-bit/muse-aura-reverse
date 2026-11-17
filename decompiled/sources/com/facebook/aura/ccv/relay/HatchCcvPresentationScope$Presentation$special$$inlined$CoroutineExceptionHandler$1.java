package com.facebook.aura.ccv.relay;

import X.C78T;
import X.C78p;
import X.CFK;
import X.HqU;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes4.dex */
public final class HatchCcvPresentationScope$Presentation$special$$inlined$CoroutineExceptionHandler$1 extends HqU implements CoroutineExceptionHandler {
    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(C78T c78t, Throwable th) {
        CFK.A08(HatchCcvPresentationScope.TAG, "Uncaught post-consolidation callback exception", th);
    }

    public HatchCcvPresentationScope$Presentation$special$$inlined$CoroutineExceptionHandler$1(C78p c78p) {
        super(c78p);
    }
}
