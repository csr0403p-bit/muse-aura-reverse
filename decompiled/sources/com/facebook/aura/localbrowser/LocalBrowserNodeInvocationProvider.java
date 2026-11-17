package com.facebook.aura.localbrowser;

import X.AbstractC3358CGz;
import X.C7384Etj;
import com.facebook.aura.nodes.api.HatchNodeInvocationHandler;
import com.facebook.aura.nodes.api.HatchNodeInvocationProvider;

/* loaded from: classes2.dex */
public final class LocalBrowserNodeInvocationProvider implements HatchNodeInvocationProvider {
    public static final int $stable = 0;
    public static final LocalBrowserNodeInvocationProvider INSTANCE = new LocalBrowserNodeInvocationProvider();

    @Override // com.facebook.aura.nodes.api.HatchNodeInvocationProvider
    public HatchNodeInvocationHandler handler(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return new LocalBrowserNodeHandler(abstractC3358CGz);
    }
}
