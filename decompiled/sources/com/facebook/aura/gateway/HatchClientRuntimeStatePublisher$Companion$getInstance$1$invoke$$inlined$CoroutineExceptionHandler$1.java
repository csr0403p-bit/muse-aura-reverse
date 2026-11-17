package com.facebook.aura.gateway;

import X.C78T;
import X.C78p;
import X.CFK;
import X.HqU;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes.dex */
public final class HatchClientRuntimeStatePublisher$Companion$getInstance$1$invoke$$inlined$CoroutineExceptionHandler$1 extends HqU implements CoroutineExceptionHandler {
    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(C78T c78t, Throwable th) {
        CFK.A0H(HatchClientRuntimeStatePublisher.TAG, "Client visibility observer failed: %s", th.getClass().getSimpleName());
    }

    public HatchClientRuntimeStatePublisher$Companion$getInstance$1$invoke$$inlined$CoroutineExceptionHandler$1(C78p c78p) {
        super(c78p);
    }
}
