package com.facebook.aura.app.noopbindings.foa;

import X.AEr;
import X.C8ee;
import X.Eu1;

/* loaded from: classes4.dex */
public final class NoOpLogger implements C8ee<Object> {
    public static final NoOpLogger INSTANCE = new NoOpLogger();

    @Override // X.C8ee
    public Eu1<?> acquireEvent(String str) {
        return AEr.A00;
    }

    @Override // X.C8ee
    public Eu1<?> acquireEvent(String str, Object obj) {
        return AEr.A00;
    }
}
