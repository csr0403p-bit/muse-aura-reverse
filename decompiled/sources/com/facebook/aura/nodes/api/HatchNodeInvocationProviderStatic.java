package com.facebook.aura.nodes.api;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import com.facebook.aura.localbrowser.LocalBrowserEndpointNodeInvocationProvider;
import com.facebook.aura.localbrowser.LocalBrowserNodeInvocationProvider;

/* loaded from: classes2.dex */
public class HatchNodeInvocationProviderStatic {
    public static int[] getKeys() {
        return new int[]{0, 1};
    }

    public static HatchNodeInvocationHandler handler(int i, AbstractC3358CGz abstractC3358CGz) {
        if (i == 0) {
            return LocalBrowserEndpointNodeInvocationProvider.INSTANCE.handler(abstractC3358CGz);
        }
        if (i == 1) {
            return LocalBrowserNodeInvocationProvider.INSTANCE.handler(abstractC3358CGz);
        }
        throw AnonymousClass005.A0c(i);
    }
}
