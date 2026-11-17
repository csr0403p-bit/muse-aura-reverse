package com.facebook.aura.subscription.repo;

import X.C4JM;
import com.facebook.aura.iap.HatchIapUserSession;

/* loaded from: classes4.dex */
public abstract class SubscriptionBillingCapabilityKt {
    public static final boolean usesIacBilling() {
        HatchIapUserSession scoped = HatchIapUserSession.Companion.getScoped(C4JM.A00());
        return scoped != null && scoped.getUseIacOverIap();
    }
}
