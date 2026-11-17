package com.facebook.aura.appupdate;

import X.AnonymousClass001;
import X.C22I;
import X.C3Em;
import X.C3pd;
import X.C7384Etj;
import X.C79;
import X.C9290GCr;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class AuraPlayFlexibleUpdateRequests {
    public static final int $stable = 0;
    public static final AuraPlayFlexibleUpdateRequests INSTANCE = new AuraPlayFlexibleUpdateRequests();
    public static final C3Em<G0U<AuraPlayFlexibleUpdateResult, Unit>> mutableRequests;
    public static final C22I<G0U<AuraPlayFlexibleUpdateResult, Unit>> requests;

    public final void request(G0U<? super AuraPlayFlexibleUpdateResult, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        C3Em<G0U<AuraPlayFlexibleUpdateResult, Unit>> c3Em = mutableRequests;
        if (AnonymousClass001.A0F(c3Em.ALE().getValue()) <= 0 || !c3Em.AhV(g0u)) {
            g0u.invoke(AuraPlayFlexibleUpdateResult.NOT_OFFERED);
        }
    }

    static {
        C9290GCr c9290GCr = new C9290GCr(C79.A00, 0, 1);
        mutableRequests = c9290GCr;
        requests = new C3pd(c9290GCr);
    }

    public final C22I<G0U<AuraPlayFlexibleUpdateResult, Unit>> getRequests() {
        return requests;
    }
}
