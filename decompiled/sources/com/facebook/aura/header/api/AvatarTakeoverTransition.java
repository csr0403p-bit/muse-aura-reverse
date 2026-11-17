package com.facebook.aura.header.api;

import X.AnonymousClass003;
import X.C1BO;
import X.C1DG;

/* loaded from: classes.dex */
public final class AvatarTakeoverTransition {
    public static final int $stable = 0;
    public final C1BO<Float> framing;
    public final C1BO<C1DG> topPadding;

    public final C1BO<Float> getFraming() {
        return this.framing;
    }

    public final C1BO<C1DG> getTopPadding() {
        return this.topPadding;
    }

    public AvatarTakeoverTransition(C1BO<Float> c1bo, C1BO<C1DG> c1bo2) {
        AnonymousClass003.A0u(c1bo, c1bo2);
        this.framing = c1bo;
        this.topPadding = c1bo2;
    }
}
