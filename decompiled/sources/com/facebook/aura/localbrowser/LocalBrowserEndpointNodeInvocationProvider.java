package com.facebook.aura.localbrowser;

import X.AbstractC3358CGz;
import X.C7384Etj;
import com.facebook.aura.nodes.api.HatchNodeInvocationHandler;
import com.facebook.aura.nodes.api.HatchNodeInvocationProvider;

/* loaded from: classes2.dex */
public final class LocalBrowserEndpointNodeInvocationProvider implements HatchNodeInvocationProvider {
    public static final int $stable = 0;
    public static final LocalBrowserEndpointNodeInvocationProvider INSTANCE = new LocalBrowserEndpointNodeInvocationProvider();

    @Override // com.facebook.aura.nodes.api.HatchNodeInvocationProvider
    public HatchNodeInvocationHandler handler(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return new LocalBrowserEndpointNodeHandler(abstractC3358CGz);
    }
}
