package com.facebook.aura.network.http;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HatchHttpRequestFailure extends C06G implements HatchHttpRequestResult {
    public final HatchHttpFailure failure;

    public HatchHttpRequestFailure(HatchHttpFailure hatchHttpFailure) {
        C7384Etj.A0Y(hatchHttpFailure, 0);
        this.failure = hatchHttpFailure;
    }

    public final HatchHttpRequestFailure copy(HatchHttpFailure hatchHttpFailure) {
        C7384Etj.A0Y(hatchHttpFailure, 0);
        return new HatchHttpRequestFailure(hatchHttpFailure);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HatchHttpRequestFailure) && C7384Etj.areEqual(this.failure, ((HatchHttpRequestFailure) obj).failure));
    }

    public static /* synthetic */ HatchHttpRequestFailure copy$default(HatchHttpRequestFailure hatchHttpRequestFailure, HatchHttpFailure hatchHttpFailure, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchHttpFailure = hatchHttpRequestFailure.failure;
        }
        C7384Etj.A0Y(hatchHttpFailure, 0);
        return new HatchHttpRequestFailure(hatchHttpFailure);
    }

    public final HatchHttpFailure component1() {
        return this.failure;
    }

    public final HatchHttpFailure getFailure() {
        return this.failure;
    }

    public int hashCode() {
        return this.failure.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
