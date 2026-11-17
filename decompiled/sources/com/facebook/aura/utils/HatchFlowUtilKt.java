package com.facebook.aura.utils;

import X.AnonymousClass003;
import X.C1BN;
import X.G0U;

/* loaded from: classes3.dex */
public abstract class HatchFlowUtilKt {
    public static final <T, R> C1BN<R> mapToStateFlow(C1BN<? extends T> c1bn, G0U<? super T, ? extends R> g0u) {
        AnonymousClass003.A0u(c1bn, g0u);
        return new MappedStateFlow(c1bn, g0u);
    }
}
