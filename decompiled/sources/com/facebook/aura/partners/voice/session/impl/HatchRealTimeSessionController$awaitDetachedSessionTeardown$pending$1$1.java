package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7559F3s;
import X.C57l;
import X.C57m;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes6.dex */
public final class HatchRealTimeSessionController$awaitDetachedSessionTeardown$pending$1$1 extends AbstractC7559F3s implements G0U<C57m, Boolean> {
    public static final HatchRealTimeSessionController$awaitDetachedSessionTeardown$pending$1$1 INSTANCE = new HatchRealTimeSessionController$awaitDetachedSessionTeardown$pending$1$1();

    public HatchRealTimeSessionController$awaitDetachedSessionTeardown$pending$1$1() {
        super(1);
    }

    @Override // X.G0U
    public final Boolean invoke(C57m c57m) {
        C7384Etj.A0Y(c57m, 0);
        return Boolean.valueOf(c57m.ADx().getValue() instanceof C57l);
    }
}
