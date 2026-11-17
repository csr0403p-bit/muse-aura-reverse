package com.facebook.aura.skills.repo;

import X.C78T;
import X.C78p;
import X.CFK;
import X.HqU;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes.dex */
public final class HatchConnectorCatalogRepository$special$$inlined$CoroutineExceptionHandler$1 extends HqU implements CoroutineExceptionHandler {
    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(C78T c78t, Throwable th) {
        CFK.A08("HatchConnectorCatalogRepository", "Background connector work failed", th);
    }

    public HatchConnectorCatalogRepository$special$$inlined$CoroutineExceptionHandler$1(C78p c78p) {
        super(c78p);
    }
}
