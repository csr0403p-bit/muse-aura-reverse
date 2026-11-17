package com.facebook.aura.analytics.impl;

import X.AbstractC3358CGz;
import X.C79;
import X.DHG;
import com.facebook.aura.auth.store.AuraUserSessionStore;
import com.facebook.aura.confidentialvm.session.ConfidentialSessionGate;

/* loaded from: classes5.dex */
public final class HatchModeStateProvider implements DHG {
    @Override // X.DHG
    public long getModeState() {
        AbstractC3358CGz currentUserSession = AuraUserSessionStore.INSTANCE.getCurrentUserSession();
        return ((currentUserSession == null || !ConfidentialSessionGate.Companion.getInstance(currentUserSession).isConfidentialVmForAnalyticsMode()) ? C79.A00 : C79.A01).intValue() != 0 ? 1L : 0L;
    }
}
