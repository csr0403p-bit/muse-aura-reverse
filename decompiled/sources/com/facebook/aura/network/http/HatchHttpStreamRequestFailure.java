package com.facebook.aura.network.http;

import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HatchHttpStreamRequestFailure implements HatchHttpStreamRequestResult {
    public final HatchHttpFailure failure;

    public HatchHttpStreamRequestFailure(HatchHttpFailure hatchHttpFailure) {
        C7384Etj.A0Y(hatchHttpFailure, 0);
        this.failure = hatchHttpFailure;
    }

    public final HatchHttpFailure getFailure() {
        return this.failure;
    }
}
