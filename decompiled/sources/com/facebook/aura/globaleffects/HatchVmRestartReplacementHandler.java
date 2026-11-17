package com.facebook.aura.globaleffects;

import X.AbstractC3358CGz;
import X.C7384Etj;
import com.facebook.aura.gateway.VmReplacementHandler;

/* loaded from: classes2.dex */
public final class HatchVmRestartReplacementHandler implements VmReplacementHandler {
    public static final int $stable = 0;
    public static final HatchVmRestartReplacementHandler INSTANCE = new HatchVmRestartReplacementHandler();

    @Override // com.facebook.aura.gateway.VmReplacementHandler
    public void onVmReplaced(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        HatchVmRestartRequest.Companion.getInstance(abstractC3358CGz).request();
    }
}
